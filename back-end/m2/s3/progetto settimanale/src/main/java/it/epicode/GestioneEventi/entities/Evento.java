package it.epicode.GestioneEventi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;


@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "events")
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class Evento extends  BaseEntity{
    private String titolo;
    private String descrizione;
    private LocalDate Data;
    private String luogo;
    private int numPostiDisponibili;
    private boolean disponibilita;
}
