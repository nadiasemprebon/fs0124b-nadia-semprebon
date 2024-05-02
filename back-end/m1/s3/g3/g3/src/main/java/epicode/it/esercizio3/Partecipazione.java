package epicode.it.esercizio3;

import epicode.it.esercizio3.enums.Stato;
import jakarta.persistence.*;

@Entity
@Table(name ="partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    @JoinColumn(name="id_persona")
    private Persona persona;


    @ManyToOne
    @JoinColumn(name="id_evento")
    private Long evento;


    @Enumerated (EnumType.STRING)
    private Stato stato;



    public Partecipazione(){}

    public Partecipazione(Persona persona, Long evento) {

        this.persona = persona;
        this.evento = evento;
        this.stato = Stato.DA_CONFERMARE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Long getEvento() {
        return evento;
    }

    public void setEvento(Long evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
