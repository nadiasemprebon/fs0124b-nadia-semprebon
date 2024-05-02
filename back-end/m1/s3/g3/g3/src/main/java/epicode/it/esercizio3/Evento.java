package epicode.it.esercizio3;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;


@Entity
@Table (name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private Long id;
    @Column (name = "titolo", length = 80, nullable = true)
    private String titolo;
    @ManyToOne
    @JoinColumn (name = "id_location")
    private Location location;
    @Column (name = "data_evento", nullable = false)
    private Date eventoData;
    @Column (name = "descrizione", length = 80, nullable = false)
    private String descrizione;
    @Column (name = "tipo_evento", nullable = false)
    private TipoEvento tipoEvento;
    @Column (name = "numeroMassimoPartecipanti", nullable = false)
    private int numeroMassimoParteciparti;
    @OneToMany(mappedBy = "evento")
    private ArrayList<Partecipazione> ListaPartecipazioni;

    public Evento(){}

    public Evento(String titolo, Date eventoData, String descrizione, TipoEvento tipoEvento, int numeroMassimoParteciparti, Location location) {

        this.titolo = titolo;
        this.eventoData = eventoData;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoParteciparti = numeroMassimoParteciparti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getEventoData() {
        return eventoData;
    }

    public void setEventoData(Date eventoData) {
        this.eventoData = eventoData;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public static class EventoDAO {
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", eventoData=" + eventoData +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoParteciparti=" + numeroMassimoParteciparti +
                '}';
    }
}
