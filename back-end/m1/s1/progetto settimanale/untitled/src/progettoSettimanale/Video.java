package progettoSettimanale;

public class  Video extends ElementoMultimendiale {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            String sequenzaPuntiEsclamativi = "!".repeat(volume);
            String sequenzaAsterischi = "*".repeat(luminosita);
            System.out.println(titolo + " " + sequenzaPuntiEsclamativi);
            System.out.println(titolo + " " + sequenzaAsterischi);
        }
    }

    //come passare un metodo da una classe all'altra senza riscriverlo?
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }


    }
    public void alzaVolume() {
        //è inutile mettere la condizione if come sopra ma con (volume<0)?
        volume++;
    }

    public void alzaLuminosità() {
        //è inutile mettere la condizione if come sopra ma con (volume<0)?
        luminosita++;
    }
    public void alzaabbassaLuminosità() {
        //è inutile mettere la condizione if come sopra ma con (volume<0)?
        luminosita--;
    }

}




