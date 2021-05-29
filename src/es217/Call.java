package es217;

import java.util.ArrayList;

public class Call extends IstruzioneUnaria {
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

    @Override
    public ArrayList<Operando> getListaOperandi() {
        return null;
    }

    @Override
    public void esegui(Operando r1) {

    }
}
