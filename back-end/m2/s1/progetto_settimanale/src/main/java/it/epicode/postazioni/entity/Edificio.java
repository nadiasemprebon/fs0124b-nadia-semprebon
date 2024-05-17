package it.epicode.postazioni.entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
//provengono da Lombok e accorciano il codice
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")

public class Edificio extends BaseEntity{

    //attributi

    private String nome;
    private String indirizzo;
    private String citta;
    @OneToMany(mappedBy = "edificio")
    private List<Postazione> postazioni;

    //costruttore

    public Edificio(String nome, String indirizzo, String citta){
        this.nome = nome;
        this.indirizzo= indirizzo;
        this.citta = citta;

    }
}
