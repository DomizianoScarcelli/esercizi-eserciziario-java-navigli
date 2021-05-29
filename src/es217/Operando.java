package es217;

public abstract class Operando {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (this instanceof Registro) return ((Registro) this).getNome() + this.getValue();
        return Integer.toString(this.value);
    }
}
