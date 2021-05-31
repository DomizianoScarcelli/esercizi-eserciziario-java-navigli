package DesignPatterns.ScrittoreDiLibri.Factories;

import DesignPatterns.ScrittoreDiLibri.Libri.Libro;
import DesignPatterns.ScrittoreDiLibri.Libri.LibroGiallo;

public class LibroGialloFactory extends LibroFactory{


    @Override
    public Libro creaLibro(String nome) {
        return new LibroGiallo(nome);
    }
}
