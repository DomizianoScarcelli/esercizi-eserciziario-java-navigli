package Eserciziario.es217;

public class Registro extends Operando {
    private final String nome;

    public Registro(String nome, int value) {
        this.nome = nome;
        this.setValue(value);
    }

    public Registro(String nome) {
        this.nome = nome;
        this.setValue(0);
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    @Override
    public boolean equals(Object other) {
        return (this.nome.equals(((Registro) other).getNome()));
    }
}
