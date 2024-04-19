package progettoSettimanale;

public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio registrazione = new RegistrazioneAudio("titolo", 10 ,5);
        //decremento di 1
        registrazione.abbassaVolume();
        //metodo che con tiene il ciclo for stampa la stringa
        registrazione.play();

        Video video = new Video("titoloVideo" , 20,14,8);
        //decremento luminosità di 1
        video.play();
        //aumento luminosità di 1
        video.alzaLuminosità();
        video.play();

        Immagine img = new Immagine("titoloImmagine",10);

        img.alzaLuminosita();
        img.show();



    }

}