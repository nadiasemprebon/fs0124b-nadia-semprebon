package com.epicode.U5D1.entities;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter  // genera getter
@Setter  //genera setter
@ToString //genera to string
@NoArgsConstructor //genera costruttore vuoto
//@AllArgsConstructor // genera costruttore con tutti gli attributi


public class Order {
    private int orderNumb;
    private List<Item> orderList;
    private Double totalCost;
    private int numPeople;
    private Date orderTime;
    private OrderStatus status;

    public Order(int orderNumb, List<Item> orderList, int numPeople){
        this.orderNumb = orderNumb;
        this.orderList = orderList;
        this.numPeople = numPeople;
        this.orderTime = new Date();
        this.status = OrderStatus.PENDING;
        this.totalCost = calculateTotal(orderList);
    }

    public Double calculateTotal(List<Item> orderList) {
        Double tot = 0.0;
        for (Item e : orderList) {
            tot += e.getPrice();
        }
        return tot;
    }
}
