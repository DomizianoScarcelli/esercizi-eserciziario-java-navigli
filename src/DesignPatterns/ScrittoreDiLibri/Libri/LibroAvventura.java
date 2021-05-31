package DesignPatterns.ScrittoreDiLibri.Libri;

public class LibroAvventura extends Libro{


    public LibroAvventura(String nome){this.setNome(nome);}


    @Override
    public void impagina() {
        System.out.println("Libro di Avventura impaginato");
    }
}
