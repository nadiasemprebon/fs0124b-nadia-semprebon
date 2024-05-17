package it.epicode.postazioni.entity;

import it.epicode.postazioni.enums.TipoPostazione;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")

public class Postazione extends BaseEntity {
    private String descrizione;
        private TipoPostazione tipo;
        private int numMaxOccupanti;
        private Edificio edificio;
        private boolean libero;
        @OneToMany(mappedBy = "postazione")
        private List<Prenotazione>prenotazioni;

}
