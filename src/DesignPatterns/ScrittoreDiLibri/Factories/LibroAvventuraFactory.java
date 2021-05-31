package DesignPatterns.ScrittoreDiLibri.Factories;

import DesignPatterns.ScrittoreDiLibri.Libri.Libro;
import DesignPatterns.ScrittoreDiLibri.Libri.LibroAvventura;

public class LibroAvventuraFactory extends LibroFactory{
    @Override
    public Libro creaLibro(String nome) {
        return new LibroAvventura(nome);
    }


}
