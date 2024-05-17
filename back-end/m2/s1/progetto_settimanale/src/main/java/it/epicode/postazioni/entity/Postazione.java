package it.epicode.postazioni.entity;

import it.epicode.postazioni.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
//commento come per le altre classi

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")

public class Postazione extends BaseEntity {
    private String descrizione;
    @Enumerated(EnumType.STRING)
        private TipoPostazione tipo;
        private int numMaxOccupanti;
        @ManyToOne
        private Edificio edificio;
        private boolean libero;
        @OneToMany(mappedBy = "postazione", fetch = FetchType.EAGER) // Modificato fetch type a EAGER per provare a risolvere il problema che non scrive piu ne db

        private List<Prenotazione>prenotazioni;

        public Postazione(String descrizione, TipoPostazione tipo, int numMaxOccupanti, Edificio edificio, boolean libero){
            this.descrizione = descrizione;
            this.tipo = tipo;
            this.numMaxOccupanti = numMaxOccupanti;
            this.libero = libero;




        }

}
