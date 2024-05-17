package it.epicode.postazioni.entity;

import it.epicode.postazioni.enums.TipoPostazione;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean(name = "utente1")
    public Utente utente1Bean() {
        return new Utente("nani1992", "Nadia","Semprebon", "nani1992@gmail.com");
    }

    @Bean(name = "utente2")
    public Utente utente2Bean() {
        return new Utente("sally", "Selene","Leonetti","Seleneleonetti@gmail.com");
    }

    @Bean(name = "utente3")
    public Utente utente3Bean() {
        return new Utente("alusaura","Alessandra", "Oliosi","alessandra@gmail.com");
    }

    @Bean(name = "edificio1")
    public Edificio edificio1Bean() {
        return new Edificio("Palasport","via Giovanni Piatti 13", "VR");
    }

    @Bean(name = "edificio2")
    public Edificio edificio2Bean() {
        return new Edificio("Stadio Bentegodi","Via Bentegodi 26", "VR");
    }

    @Bean(name = "edificio3")
    public Edificio edificio3Bean() {
        return new Edificio("Sala Comunale","piazza Risorgimento 1", "MI");
    }

    @Bean(name = "edificio4")
    public Edificio edificio4Bean() {
        return new Edificio("Teatro Rondinelle","via Egidio Bersagli", "NA");
    }

    @Bean(name = "postazione1")
    public Postazione postazione1Bean() {
        return new Postazione("La Libertà", TipoPostazione.PRIVATO, 150, edificio1Bean(), true);
    }

    @Bean(name = "postazione2")
    public Postazione postazione2Bean() {
        return new Postazione("I diritti Umani", TipoPostazione.OPENSPACE, 70, edificio2Bean(),false);
    }

    @Bean(name = "postazione3")
    public Postazione postazione3Bean() {
        return new Postazione("La Primavera del Libro", TipoPostazione.SALA_RIUNIONI, 200, edificio3Bean(),true);
    }

}
