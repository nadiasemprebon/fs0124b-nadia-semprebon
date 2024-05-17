package it.epicode.postazioni.entity;

import it.epicode.postazioni.service.EdificioService;
import it.epicode.postazioni.service.PostazioneService;
import it.epicode.postazioni.service.PrenotazioneService;
import it.epicode.postazioni.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//serve per scrivere le db, senza non funziona

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


        postazioneService.save(postazione1);
        postazioneService.save(postazione2);
        postazioneService.save(postazione3);




    }
}
