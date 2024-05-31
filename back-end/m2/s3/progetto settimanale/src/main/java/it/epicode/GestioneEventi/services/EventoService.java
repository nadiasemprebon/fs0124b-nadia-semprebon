package it.epicode.GestioneEventi.services;

import it.epicode.GestioneEventi.entities.Evento;
import it.epicode.GestioneEventi.Exceptions.EventoNonTrovatoException;
import it.epicode.GestioneEventi.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> listaEventi() {
        return eventoRepository.findAll();
    }

    public Evento creaEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public Evento aggiornaEvento(Long id, Evento evento) {
        if (eventoRepository.existsById(id)) {
            evento.setId(id);
            return eventoRepository.save(evento);
        } else {
            throw new EventoNonTrovatoException("Evento con ID " + id + " non trovato.");
        }
    }

    public void eliminaEvento(Long id) {
        if (eventoRepository.existsById(id)) {
            eventoRepository.deleteById(id);
        } else {
            throw new EventoNonTrovatoException("Evento con ID " + id + " non trovato.");
        }
    }
}
