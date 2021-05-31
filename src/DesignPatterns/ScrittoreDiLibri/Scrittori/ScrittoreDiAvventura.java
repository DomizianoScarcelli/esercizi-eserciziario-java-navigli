package DesignPatterns.ScrittoreDiLibri.Scrittori;

import DesignPatterns.ScrittoreDiLibri.Factories.LibroAvventuraFactory;
import DesignPatterns.ScrittoreDiLibri.Libri.Libro;

public class ScrittoreDiAvventura extends Scrittore{


    @Override
    public Libro pubblica(String nome) {
        LibroAvventuraFactory libroAvventuraFactory = new LibroAvventuraFactory();
        Libro libro = libroAvventuraFactory.creaLibro(nome);
        libriPubblicati.add(libro);
        return libro;
    }
}
