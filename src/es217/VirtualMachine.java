package es217;

import java.util.ArrayList;

public class VirtualMachine {
    public Procedura procedura;
    public ArrayList<Registro> listaRegistri;


    public VirtualMachine(Procedura procedura) {
        this.procedura = procedura;
        for (Istruzione istruzione : procedura.getListaIstruzioni()) {
            ///do something
        }
    }


    public void esegui() {
        procedura.esegui();
    }

    public String stampaValoriRegistri() {
        StringBuilder sb = new StringBuilder();
        for (Registro registro : procedura.getListaRegistri()) {
            sb.append("%s: %s".formatted(registro.getNome(), registro.getValue()));
            sb.append("\n");
        }
        return sb.toString();
    }


}
