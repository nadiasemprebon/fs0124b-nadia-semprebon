package it.epicode;

import jakarta.persistence.Id;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        var eventoDAO = new EventoDAO();
        var e1 = new Evento(1L, "Suicidio di Massa", new Date(), "Accogliamo la pace eterna dopo una vita di stenti", TipoEvento.PRIVATO, 666);
        eventoDAO.save(e1);

    }
}