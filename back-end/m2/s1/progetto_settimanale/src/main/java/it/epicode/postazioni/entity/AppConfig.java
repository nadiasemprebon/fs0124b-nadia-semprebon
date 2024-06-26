package it.epicode.postazioni.entity;

import it.epicode.postazioni.enums.TipoPostazione;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {

    // Creazione di un bean per l'utente1 con i dati di Nadia Semprebon
    @Bean(name = "utente1")
    public Utente utente1Bean() {
        return new Utente("nani1992", "Nadia", "Semprebon", "nani1992@gmail.com");
    }

    // Creazione di un bean per l'utente2 con i dati di Selene Leonetti
    @Bean(name = "utente2")
    public Utente utente2Bean() {
        return new Utente("sally", "Selene", "Leonetti", "Seleneleonetti@gmail.com");
    }

    // Creazione di un bean per l'utente3 con i dati di Alessandra Oliosi
    @Bean(name = "utente3")
    public Utente utente3Bean() {
        return new Utente("alusaura", "Alessandra", "Oliosi", "alessandra@gmail.com");
    }

    // Creazione di un bean per l'edificio1 con il nome, indirizzo e città di Palasport
    @Bean(name = "edificio1")
    public Edificio edificio1Bean() {
        return new Edificio("Palasport", "via Giovanni Piatti 13", "VR");
    }

    // Creazione di un bean per l'edificio2 con il nome, indirizzo e città di Stadio Bentegodi
    @Bean(name = "edificio2")
    public Edificio edificio2Bean() {
        return new Edificio("Stadio Bentegodi", "Via Bentegodi 26", "VR");
    }

    // Creazione di un bean per l'edificio3 con il nome, indirizzo e città di Sala Comunale
    @Bean(name = "edificio3")
    public Edificio edificio3Bean() {
        return new Edificio("Sala Comunale", "piazza Risorgimento 1", "MI");
    }

    @Bean(name = "postazione1")
    public Postazione postazione1Bean() {
        return new Postazione("Spazio riservato" , TipoPostazione.PRIVATO, 150, edificio1Bean());
    }

    @Bean(name = "postazione2")
    public Postazione postazione2Bean() {
        return new Postazione("Grandi conferenze", TipoPostazione.OPENSPACE, 70, edificio2Bean());
    }

    @Bean(name = "postazione3")
    public Postazione postazione3Bean() {
        return new Postazione("Piccoli e grandi eventi", TipoPostazione.SALA_RIUNIONI, 200, edificio3Bean());
    }

}


