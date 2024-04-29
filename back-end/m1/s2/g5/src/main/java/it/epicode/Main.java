package it.epicode;

import java.awt.print.Book;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // creo un array dove inserire gli esempi di libro e rivista da inserire
        var archivio = new ArrayList<DocumentoCartaceo>();

        //inizializzo il libro
        archivio.add(new Libro(1234567L, "'Atleta Vincente'", 2023, 320, "'Massimo Binelli'",
                "crescita personale"));
        //inizializzo la rivista
        archivio.add(new Rivista(134567L, "'Coltiva la tua serra'", 2024, 100, Periodicita.SEMESTRALE ));

        //creo variabile ISBNToSearch

       Long ISBNToSearch = 1234567L;
       int annoTrovato = 2024;
       String authorToSearch = "Binelli";


       //recupero  elemento con quell'ISBN
        var ISBNFound = archivio.stream()
                .filter(e -> e.getISBN().equals(ISBNToSearch) )
                .toList();

        var annoFound = archivio.stream()
                .filter(e -> e.getAnnoPubblicazione() == annoTrovato )
                .toList();

        //
        var autoreFound = archivio.stream()
                .filter(e -> e instanceof Libro && ((Libro) e).getAutore().equals(authorToSearch))
                .toList();



        ISBNFound.forEach(e -> System.out.println("Il libro con ISBN: " + ISBNToSearch + " è " + e.getTitolo() + "."));


        archivio.removeIf(e -> e.getISBN().equals(ISBNToSearch));

        System.out.println("L'elemento con ISBN " + ISBNToSearch + " è stato rimosso dalla tua biblioteca.");
        annoFound.forEach(e -> System.out.println("Il libro: " + e.getTitolo()  + " è dell'anno: " + annoTrovato + "."));
        autoreFound.forEach(e -> System.out.println("Il libro dell'autore " + authorToSearch + " è " + e.getTitolo() + "."));


    }
}