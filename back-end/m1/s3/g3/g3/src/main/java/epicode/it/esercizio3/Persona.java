package epicode.it.esercizio3;

import epicode.it.esercizio3.enums.Sesso;
import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;


@Entity
@Table(name="persone")
public class Persona {

    @Id
    @GeneratedValue
    private Long id;

    @Column (name="nome", length = 50,nullable = false)
    private String nome;
    @Column (name="cognome", length = 50,nullable = false)
    private String cognome;
    @Column (name="nome", length = 50,nullable = false)
    private String email;
    @Column (name="data_nascita", length = 50,nullable = false)
    private Data dataNascita;
    @Enumerated(EnumType.STRING)
    private Sesso sesso;
    @Column (name="lista_partecipazioni")
    @OneToMany(mappedBy = "persona")
    private ArrayList<Partecipazione> listaPartecipazioni;


public Persona(){}

    public Persona(String nome, String cognome, String email, Data dataNascita, Sesso sesso, ArrayList<Partecipazione> listaPartecipazioni) {

        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        this.listaPartecipazioni = listaPartecipazioni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Data getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Data dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public ArrayList<Partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(ArrayList<Partecipazione> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascita=" + dataNascita +
                ", sesso=" + sesso +
                ", listaPartecipazioni=" + listaPartecipazioni.toString() +
                '}';
    }
}
