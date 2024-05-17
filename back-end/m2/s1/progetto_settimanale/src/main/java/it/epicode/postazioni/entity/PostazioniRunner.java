package it.epicode.postazioni.entity;
import it.epicode.postazioni.entity.Edificio;
import it.epicode.postazioni.entity.Postazione;
import it.epicode.postazioni.entity.Prenotazione;
import it.epicode.postazioni.entity.Utente;
import it.epicode.postazioni.service.EdificioService;
import it.epicode.postazioni.service.PostazioneService;
import it.epicode.postazioni.service.PrenotazioneService;
import it.epicode.postazioni.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


//serve per scrivere le db.Quando ti ho chiamto funzionava e ora non funziona di nuovo

@Component
public class PostazioniRunner implements CommandLineRunner {


    //iniezione delle dipendenze

    @Autowired
    private  EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    private ApplicationContext ctx;
    @Autowired
    private UtenteService utenteService;

    //metodo run eseguito dall'app

    @Override
    public void run(String... args) throws Exception {
        // Recupero dei bean Utente dal contesto dell'applicazione
        Utente utente1 = (Utente) ctx.getBean("utente1");
        Utente utente2 = (Utente) ctx.getBean("utente2");
        Utente utente3 = (Utente) ctx.getBean("utente3");

// Recupero dei bean Edificio dal contesto dell'applicazione
        Edificio edificio1 = (Edificio) ctx.getBean("edificio1");
        Edificio edificio2 = (Edificio) ctx.getBean("edificio2");
        Edificio edificio3 = (Edificio) ctx.getBean("edificio3");

// Recupero dei bean Postazione dal contesto dell'applicazione

        Postazione postazione1 = (Postazione) ctx.getBean("postazione1");
        Postazione postazione2 = (Postazione) ctx.getBean("postazione2");
        Postazione postazione3 = (Postazione) ctx.getBean("postazione3");

// Salvataggio degli utenti nel database tramite UtenteService, poi di edificioService ed infine di postazioneService
        utenteService.save(utente1);
        utenteService.save(utente2);
        utenteService.save(utente3);


        edificioService.save(edificio1);
        edificioService.save(edificio2);
        edificioService.save(edificio3);


        postazione1 = postazioneService.saveAndReturn(postazione1);
        postazione2 = postazioneService.saveAndReturn(postazione2);
        postazione3 = postazioneService.saveAndReturn(postazione3);


        Prenotazione prenotazione1 = Prenotazione.builder()
                .withUtente(utente1)
                .withPostazione(postazione1)
                .withDataPrenotazione(LocalDate.now().plusDays(1))
                .build();
        Prenotazione prenotazione2 = Prenotazione.builder()
                .withUtente(utente2)
                .withPostazione(postazione2)
                .withDataPrenotazione(LocalDate.now().plusDays(2))
                .build();

        Prenotazione prenotazione3 = Prenotazione.builder()
                .withUtente(utente3)
                .withPostazione(postazione3)
                .withDataPrenotazione(LocalDate.now().plusDays(3))
                .build();
        try {
            prenotazioneService.creaPrenotazione(prenotazione1);
            prenotazioneService.creaPrenotazione(prenotazione2);
            prenotazioneService.creaPrenotazione(prenotazione3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
