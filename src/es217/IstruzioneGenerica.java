package es217;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class IstruzioneGenerica implements Istruzione {
    private ArrayList<Operando> operandi;

    public abstract int esegui();

    public abstract String getNome();

    public void setRegistri(Operando... registri) {
        this.operandi = (ArrayList<Operando>) Arrays.asList(registri);
    }

    public void addOperando(Operando operando) {
        operandi.add(operando);
    }

    @Override
    public ArrayList<Operando> getListaOperandi() {
        return operandi;
    }


}
