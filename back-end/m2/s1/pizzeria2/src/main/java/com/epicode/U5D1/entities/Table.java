package com.epicode.U5D1.entities;

import lombok.*;

@Getter  // genera getter
@Setter  //genera setter
@ToString //genera to string
@NoArgsConstructor //genera costruttore vuoto
@AllArgsConstructor // genera costruttore con tutti gli attributi



public class Table {
    private int tableNumber;
    private int numMaxPeople;
    private TableStatus status;






}
