package DesignPatterns.ScrittoreDiLibri.Libri;

public class Fumetto extends Libro {


    public Fumetto(String nome){this.setNome(nome);}



    @Override
    public void impagina() {
        System.out.println("Fumetto impaginato");
    }
}
