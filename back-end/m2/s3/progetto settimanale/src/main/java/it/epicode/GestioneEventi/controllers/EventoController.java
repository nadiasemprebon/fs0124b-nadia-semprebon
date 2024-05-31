package it.epicode.GestioneEventi.controllers;

import it.epicode.GestioneEventi.entities.Evento;
import it.epicode.GestioneEventi.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventi")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> listaEventi() {
        return eventoService.listaEventi();
    }

    @PostMapping
    public Evento creaEvento(@RequestBody Evento evento) {
        return eventoService.creaEvento(evento);
    }

    @PutMapping("/{id}")
    public Evento aggiornaEvento(@PathVariable Long id, @RequestBody Evento evento) {
        return eventoService.aggiornaEvento(id, evento);
    }

    @DeleteMapping("/{id}")
    public void eliminaEvento(@PathVariable Long id) {
        eventoService.eliminaEvento(id);
    }
}
