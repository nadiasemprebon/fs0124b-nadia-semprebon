package it.epicode;

public class Rivista extends DocumentoCartaceo{

    public Rivista(Long ISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        this.periodicita = periodicita;
        super.setISBN(ISBN);
        super.setTitolo(titolo);
        super.setAnnoPubblicazione(annoPubblicazione);
        super.setNumeroPagine(numeroPagine);
    }

    private Periodicita periodicita;

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }


}
