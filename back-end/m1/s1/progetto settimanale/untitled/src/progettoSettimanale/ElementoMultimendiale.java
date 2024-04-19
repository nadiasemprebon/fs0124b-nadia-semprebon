package progettoSettimanale;

public abstract class ElementoMultimendiale {


    /*attributo comune a tutte le classi*/
    //i getter e setter servivano anche se le variabili sono protected e non private?
    protected String titolo;
    protected int durata;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public ElementoMultimendiale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    //metodo che riproducio Video e Registrazione Audio
        public abstract void play ();

    }


