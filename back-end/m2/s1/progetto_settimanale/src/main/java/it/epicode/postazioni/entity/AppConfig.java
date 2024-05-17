package it.epicode.postazioni.entity;

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

}
