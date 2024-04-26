package it.epicode;

public class Libro extends DocumentoCartaceo{


    private String autore;
    private String genere;
    public Libro(Long ISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        this.autore = autore;
        this.genere = genere;
        super.setISBN(ISBN);
        super.setTitolo(titolo);
        super.setAnnoPubblicazione(annoPubblicazione);
        super.setNumeroPagine(numeroPagine);

    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }



}
