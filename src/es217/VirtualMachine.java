package es217;

public class VirtualMachine implements Istruzione {
    public final Procedura procedura;

    public VirtualMachine(Procedura procedura) {
        this.procedura = procedura;
    }

    @Override
    public void esegui() {
        procedura.esegui();
    }
    
}
