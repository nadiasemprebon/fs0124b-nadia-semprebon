package it.epicode.pizzeria;

public class Cipolle extends Prodotto {
    public Cipolle(){
        super.setPrezzo(super.getPrezzo() + 1.00);
        super.setCalorie(super.getCalorie() + 20);

}}
