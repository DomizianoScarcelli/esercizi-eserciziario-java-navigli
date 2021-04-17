package es217;

public class Call extends IstruzioneGenerica {
    private final Procedura procedura;

    public Call(Procedura procedura) {
        this.procedura = procedura;
    }

    @Override
    public int esegui() {
        return procedura.esegui();
    }

    @Override
    public String getNome() {
        return "CALL";
    }

}
