package it.epicode.pizzeria;

public class Zucchini extends Prodotto {
    public Zucchini() {
        super.setPrezzo(super.getPrezzo() + 1.00);
        super.setCalorie(super.getCalorie() + 80);
    }
}