package it.epicode.GestioneEventi.services;

import it.epicode.GestioneEventi.entities.Utente;
import it.epicode.GestioneEventi.Exceptions.UtenteGiaEsistenteException;
import it.epicode.GestioneEventi.Exceptions.UtenteNonTrovatoException;
import it.epicode.GestioneEventi.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Utente registraUtente(Utente utente) {
        if (utenteRepository.findByUsername(utente.getUsername()) != null) {
            throw new UtenteGiaEsistenteException("Utente con username " + utente.getUsername() + " già esistente.");
        }
        utente.setPassword(passwordEncoder.encode(utente.getPassword()));
        return utenteRepository.save(utente);
    }

    public Utente accessoUtente(String username, String password) {
        Utente utente = utenteRepository.findByUsername(username);
        if (utente != null && passwordEncoder.matches(password, utente.getPassword())) {
            return utente;
        } else {
            throw new UtenteNonTrovatoException("Utente con username " + username + " non trovato o password errata.");
        }
    }
}
