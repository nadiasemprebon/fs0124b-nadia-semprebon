package it.epicode.GestioneEventi.services;

import it.epicode.GestioneEventi.entities.Prenotazione;
import it.epicode.GestioneEventi.Exceptions.PrenotazioneNonTrovataException;
import it.epicode.GestioneEventi.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public List<Prenotazione> listaPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    public Prenotazione creaPrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public Prenotazione aggiornaPrenotazione(Long id, Prenotazione prenotazione) {
        if (prenotazioneRepository.existsById(id)) {
            prenotazione.setId(id);
            return prenotazioneRepository.save(prenotazione);
        } else {
            throw new PrenotazioneNonTrovataException("Prenotazione con ID " + id + " non trovata.");
        }
    }

    public void eliminaPrenotazione(Long id) {
        if (prenotazioneRepository.existsById(id)) {
            prenotazioneRepository.deleteById(id);
        } else {
            throw new PrenotazioneNonTrovataException("Prenotazione con ID " + id + " non trovata.");
        }
    }
}
