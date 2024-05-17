package it.epicode.pizzeria;

public class Salame extends Prodotto{

    public Salame(){
        super.setPrezzo(super.getPrezzo() + 1.20);
        super.setCalorie(super.getCalorie() + 150);

    };


}
