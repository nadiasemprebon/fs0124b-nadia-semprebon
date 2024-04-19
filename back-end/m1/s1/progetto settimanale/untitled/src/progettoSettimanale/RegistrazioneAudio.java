package progettoSettimanale;

public class RegistrazioneAudio extends ElementoMultimendiale {
    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo, durata);
    }
    @Override
    public void play() {
        System.out.println("Riproduco l'immagine");
    }
}
