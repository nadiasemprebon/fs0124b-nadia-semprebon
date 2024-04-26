package it.epicode;
//ho esteso la classe genitore alla figlia e quindi anche i suoi attributi

public class Rivista extends DocumentoCartaceo{


    public Rivista(Long ISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        this.periodicita = periodicita;
        //estensione degli attributi con il super e anche con il set perchè erano privati nel genitore
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
