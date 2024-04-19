package progettoSettimanale;

public class Immagine extends ElementoMultimendiale{

    public Immagine(String titolo, int durata) {
        super(titolo, durata);
    }
    @Override
    public void play() {
        System.out.println("Riproduco l'immagine");
    }
}

