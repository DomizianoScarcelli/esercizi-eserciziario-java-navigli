package DesignPatterns.ScrittoreDiLibri.Factories;

import DesignPatterns.ScrittoreDiLibri.Libri.Libro;

public abstract class LibroFactory{
    public abstract Libro creaLibro(String nome);
    }
