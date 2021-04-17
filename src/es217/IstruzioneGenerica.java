package es217;

public abstract class IstruzioneGenerica implements Istruzione {
    private Operando[] registri;

    public abstract void esegui();

    public Operando[] getRegistri() {
        return registri;
    }

    public void setRegistri(Operando... registri) {
        this.registri = registri;
    }
}
