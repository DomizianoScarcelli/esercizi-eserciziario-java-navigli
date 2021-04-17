package es217;

import java.util.ArrayList;
import java.util.Arrays;

public class Procedura extends IstruzioneGenerica {
    private ArrayList<Istruzione> listaIstruzioni;

    public Procedura(Istruzione... listaIstruzioni) {
        this.listaIstruzioni = (ArrayList<Istruzione>) Arrays.asList(listaIstruzioni);
    }

    public Procedura() {
        this.listaIstruzioni = new ArrayList<>();
    }


    @Override
    public void esegui() {
        for (Istruzione istruzione : listaIstruzioni) {
            istruzione.esegui();
        }
    }

    public void addIstruzione(Istruzione istruzione) {
        this.listaIstruzioni.add(istruzione);
    }
}
