package progettoSettimanale;

public abstract class ElementoMultimendiale {


    /*attributo comune a tutte le classi*/

    protected String titolo;
    protected int durata;


    public ElementoMultimendiale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

        public abstract void play ();
    }


