package it.epicode.GestioneEventi.controllers;

import it.epicode.GestioneEventi.entities.Prenotazione;
import it.epicode.GestioneEventi.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

    @Autowired
    private PrenotazioneService prenotazioneService;

    @GetMapping
    public List<Prenotazione> listaPrenotazioni() {
        return prenotazioneService.listaPrenotazioni();
    }

    @PostMapping
    public Prenotazione creaPrenotazione(@RequestBody Prenotazione prenotazione) {
        return prenotazioneService.creaPrenotazione(prenotazione);
    }

    @PutMapping("/{id}")
    public Prenotazione aggiornaPrenotazione(@PathVariable Long id, @RequestBody Prenotazione prenotazione) {
        return prenotazioneService.aggiornaPrenotazione(id, prenotazione);
    }

    @DeleteMapping("/{id}")
    public void eliminaPrenotazione(@PathVariable Long id) {
        prenotazioneService.eliminaPrenotazione(id);
    }
}
