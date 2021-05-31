package DesignPatterns.ScrittoreDiLibri.Scrittori;

import DesignPatterns.ScrittoreDiLibri.Factories.LibroGialloFactory;
import DesignPatterns.ScrittoreDiLibri.Libri.Libro;
import DesignPatterns.ScrittoreDiLibri.Libri.LibroGiallo;

public class ScrittoreDiGialli extends Scrittore{
    @Override
    public Libro pubblica(String nome) {
        LibroGialloFactory libroGialloFactory = new LibroGialloFactory();
        Libro libro = libroGialloFactory.creaLibro(nome);
        libriPubblicati.add(libro);
        return libro;
    }
}
