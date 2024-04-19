package progettoSettimanale;

public class  Video extends ElementoMultimendiale {

    public Video(String titolo, int durata) {
        super(titolo, durata);
    }
    @Override
    public void play() {
        System.out.println("Riproduco" + titolo);
    }
}