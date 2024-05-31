package it.epicode.GestioneEventi.controllers;

import it.epicode.GestioneEventi.entities.Utente;
import it.epicode.GestioneEventi.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UtenteService utenteService;

    @PostMapping("/register")
    public ResponseEntity<Utente> registerUser(@RequestBody Utente utente) {
        Utente nuovoUtente = utenteService.registraUtente(utente);
        return new ResponseEntity<>(nuovoUtente, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<Utente> loginUser(@RequestBody Utente utente) {
        Utente utenteAutenticato = utenteService.accessoUtente(utente.getUsername(), utente.getPassword());
        return new ResponseEntity<>(utenteAutenticato, HttpStatus.OK);
    }
}

