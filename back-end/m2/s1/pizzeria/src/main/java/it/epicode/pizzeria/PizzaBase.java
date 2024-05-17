package it.epicode.pizzeria;

import java.util.List;

public class PizzaBase extends Prodotto {

    private List<String> margherita = List.of(new String[]{"pomodoro","mozzarella"});

      public PizzaBase(){};

    public PizzaBase(List<String> margherita) {
        this.margherita = margherita;
        super.setCalorie(1000);
        super.setPrezzo(5.00);
    }

    public List<String> getMargherita() {
        return margherita;
    }


}
