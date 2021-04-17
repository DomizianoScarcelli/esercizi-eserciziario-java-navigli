package es217;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class IstruzioneBinaria implements Istruzione {
    private Operando r1;
    private Operando r2;

    public abstract int esegui();

    public abstract String getNome();

    public void setR1(Operando r1) {
        this.r1 = r1;
    }

    public void setR2(Operando r2) {
        this.r2 = r2;
    }

    public Operando getR1() {
        return r1;
    }

    public Operando getR2() {
        return r2;
    }

    @Override
    public ArrayList<Operando> getListaOperandi() {
        return new ArrayList<>(Arrays.asList(r1, r2));
    }

    @Override
    public String toString() {
        if (this.getR2() instanceof Registro)
            return "%s %s, %s".formatted(this.getNome(), ((Registro) this.getR1()).getNome(), ((Registro) this.getR2()).getNome());
        return "%s %s, %s".formatted(this.getNome(), ((Registro) this.getR1()).getNome(), this.getR2().getValue());

    }
}
