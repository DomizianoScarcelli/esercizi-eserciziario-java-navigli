package Eserciziario.es217;

public abstract class IstruzioneUnaria implements Istruzione {
    private Operando r1;

    public abstract void esegui(Operando r1);

    public Operando getR1() {
        return r1;
    }

    public void setR1(Operando r1) {
        this.r1 = r1;
    }
}
