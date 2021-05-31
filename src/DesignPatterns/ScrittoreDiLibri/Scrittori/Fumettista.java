package DesignPatterns.ScrittoreDiLibri.Scrittori;

import DesignPatterns.ScrittoreDiLibri.Factories.FumettoFactory;
import DesignPatterns.ScrittoreDiLibri.Libri.Libro;

import java.util.ArrayList;

public class Fumettista extends Scrittore{


    @Override
    public Libro pubblica(String nome) {
        FumettoFactory fumettoFactory = new FumettoFactory();
        Libro libro = fumettoFactory.creaLibro(nome);
        libriPubblicati.add(libro);
        return libro;
    }
}
