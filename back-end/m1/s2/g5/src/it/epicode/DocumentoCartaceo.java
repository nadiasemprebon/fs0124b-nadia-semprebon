package it.epicode;
// ho creato una classe genitore con gli attributi che hanno entrambe le classi figlie

public abstract class DocumentoCartaceo {
    private Long ISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;

//costruttore vuoto (non ho ancora capito perchè serve ma serve)
    public DocumentoCartaceo(){};

// creo getter/setter per aver la possibilità di utilizzare gli attributi della
// classe genitore al di fuori della stessa

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }


}
