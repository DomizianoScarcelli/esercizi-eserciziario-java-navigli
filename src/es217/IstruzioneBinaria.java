package es217;

public abstract class IstruzioneBinaria implements Istruzione {
    private Operando r1;
    private Operando r2;

    public abstract void esegui();

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
}
