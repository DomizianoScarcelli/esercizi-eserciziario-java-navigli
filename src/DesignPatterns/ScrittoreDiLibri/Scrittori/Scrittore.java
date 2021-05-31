package DesignPatterns.ScrittoreDiLibri.Scrittori;

import DesignPatterns.ScrittoreDiLibri.Libri.Libro;

import java.util.ArrayList;

public abstract class Scrittore {
    ArrayList<Libro> libriPubblicati = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libriPubblicati){
            sb.append(libro.getNome());
            sb.append("\n");
        }
        return sb.toString();
    }

    public abstract Libro pubblica(String nome);
}
