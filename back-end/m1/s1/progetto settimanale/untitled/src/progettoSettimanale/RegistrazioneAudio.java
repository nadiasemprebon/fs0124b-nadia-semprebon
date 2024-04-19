package progettoSettimanale;

public class RegistrazioneAudio extends ElementoMultimendiale {
    private int volume;
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    /*metodo che richiamo dalla classe abstract*/
    @Override
    public void play() {
        //ciclo che incrementa fino alla durata massima della Registrazione
        for (int i = 0; i < durata; i++){
            //metodo che aumenta il valore della stringa a cui è associato ed ha come parametro il volume
            String sequenzaPuntiEsclamativi = "!".repeat(volume);

            System.out.println(titolo + " " + sequenzaPuntiEsclamativi);
        }

    }
    //metodo per abbassare il volume.Quando è maggiore di zero, decrementalo

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }


    }
    public void alzaVolume() {
        //è inutile mettere la condizione if come sopra ma con (volume<0)?
        volume++;
    }

}
