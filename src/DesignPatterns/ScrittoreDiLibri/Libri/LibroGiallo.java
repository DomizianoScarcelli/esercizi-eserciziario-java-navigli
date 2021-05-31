package DesignPatterns.ScrittoreDiLibri.Libri;

public class LibroGiallo extends Libro{


    public LibroGiallo(String nome){this.setNome(nome);}


    @Override
    public void impagina() {
        System.out.println("Libro Giallo impaginato");
    }
}
