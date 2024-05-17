package it.epicode.postazioni.entity;

import it.epicode.postazioni.enums.TipoPostazione;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
//commento come per le altre classi

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")

public class Postazione extends BaseEntity {
    private String descrizione;
        private TipoPostazione tipo;
        private int numMaxOccupanti;
        @ManyToOne
        private Edificio edificio;
        private boolean libero;
        @OneToMany(mappedBy = "postazione")

        private List<Prenotazione>prenotazioni;

        public Postazione(String descrizione, TipoPostazione tipo, int numMaxOccupanti, Edificio edificio){
            this.descrizione = descrizione;
            this.tipo = tipo;
            this.numMaxOccupanti = numMaxOccupanti;
            this.libero = true;




        }

}
