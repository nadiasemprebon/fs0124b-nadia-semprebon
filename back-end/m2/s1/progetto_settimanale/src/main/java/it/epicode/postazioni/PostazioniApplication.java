package it.epicode.postazioni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostazioniApplication {
// perchè nelle tabelle in PgAdimn non mi inserisce gli attributi in ordine di inserimento nel costruttore?
	public static void main(String[] args) {
		SpringApplication.run(PostazioniApplication.class, args);
	}

}
