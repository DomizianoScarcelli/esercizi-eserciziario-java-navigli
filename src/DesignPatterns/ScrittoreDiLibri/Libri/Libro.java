package DesignPatterns.ScrittoreDiLibri.Libri;

public abstract class Libro {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void impagina();
}
