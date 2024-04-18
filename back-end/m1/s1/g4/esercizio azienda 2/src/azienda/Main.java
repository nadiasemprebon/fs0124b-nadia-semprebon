package azienda;

public class Main {



    public static void main(String[] args) {

        Dipendente dip1 = new Dipendente(1, 1500, Dipartimento.VENDITE);
        Dipendente dip2 = new Dipendente(2, 1800, Dipartimento.AMMINISTRAZIONE);
        Dipendente dip3 = new Dipendente(3, 1500, Dipartimento.PRODUZIONE);

        Dipendente[] dipendente = {dip1, dip2, dip3};


        for (int i = 0; i < dipendente.length; i++) {
            Dipendente dipendenteCorrente = dipendente[i];
            System.out.println(dipendenteCorrente.getMatricola());
            System.out.println(dipendenteCorrente.getStipendio());
            System.out.println(dipendenteCorrente.getDipartimento());
        }


    }}