package telefono;

public class Sim {

    private int numero;
    private float credito;
    private Chiamata[] listaChiamate
            public Sim(){
        numero 0456860438;
        credito 0;
        listaChiamate = new Chiamata[10];
    }
    public Sim (long numero){
        numero = numero
    }
    public void stampaDati(){
        System.out.println("Numero di telefono:" + numero);
        System.out.println("Credito:" + credito);
        System.out.println("Ultime 10 chiamate:" + credito);

    }
}
