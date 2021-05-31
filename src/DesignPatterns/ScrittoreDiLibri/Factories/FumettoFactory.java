package DesignPatterns.ScrittoreDiLibri.Factories;

import DesignPatterns.ScrittoreDiLibri.Libri.Fumetto;
import DesignPatterns.ScrittoreDiLibri.Libri.Libro;

public class FumettoFactory extends LibroFactory {

    @Override
    public Libro creaLibro(String nome) {
        return new Fumetto(nome);
    }
}
