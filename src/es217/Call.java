package es217;

public class Call extends IstruzioneGenerica {
    private final Procedura procedura;

    public Call(Procedura procedura) {
        this.procedura = procedura;
    }

    @Override
    public void esegui() {
        this.procedura.esegui();
    }
}
