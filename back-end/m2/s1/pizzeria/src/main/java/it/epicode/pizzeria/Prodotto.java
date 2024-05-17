package it.epicode.pizzeria;

import java.util.List;

public abstract class Prodotto {
     private Double prezzo = 0.00;
     private int calorie = 0;


    public Prodotto(){};


    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

}
