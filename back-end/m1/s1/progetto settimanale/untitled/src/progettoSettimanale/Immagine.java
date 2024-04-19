package progettoSettimanale;

public class Immagine extends ElementoMultimendiale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo, 0);
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        System.out.println("Riproduco l'immagine" + titolo);
    }

    public void show() {
        System.out.print(this.titolo);
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public void alzaLuminosita() {
        if (luminosita < 10) {
            //è inutile mettere la condizione if come sopra ma con (volume<0)?
            luminosita++;
        } else {
            System.out.println("luminosita al massimo");
        }
    }

    public void abbassaLuminosita() {
        if (luminosita > 0) {
            //è inutile mettere la condizione if come sopra ma con (volume<0)?
            luminosita--;
        }
        else System.out.println("luminosita al minimo");
    }
}



