package it.epicode.postazioni.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")


public class Prenotazione extends BaseEntity {
    @ManyToOne
	private Utente utente;
	@ManyToOne
	private Postazione postazione;
	private LocalDate dataPrenotazione;
}
