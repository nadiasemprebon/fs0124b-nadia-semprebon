package it.epicode.GestioneEventi.controllers;

import it.epicode.GestioneEventi.entities.Utente;
import it.epicode.GestioneEventi.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utenti")
public class UtenteController {

    @Autowired
    private UtenteService utenteService;

    @PostMapping("/registrazione")
    public Utente registrazioneUtente(@RequestBody Utente utente) {
        return utenteService.registraUtente(utente);
    }

    @PostMapping("/accesso")
    public Utente accessoUtente(@RequestBody Utente utente) {
        return utenteService.accessoUtente(utente.getUsername(), utente.getPassword());
    }
}
