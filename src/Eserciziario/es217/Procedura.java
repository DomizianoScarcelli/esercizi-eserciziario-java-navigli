package Eserciziario.es217;

import java.util.ArrayList;
import java.util.Arrays;

public class Procedura extends IstruzioneGenerica {
    private ArrayList<Istruzione> listaIstruzioni;
    private ArrayList<Registro> listaRegistri = new ArrayList<>();

    public Procedura(Istruzione... listaIstruzioni) {
        this.listaIstruzioni = (ArrayList<Istruzione>) Arrays.asList(listaIstruzioni);
        //Istruzioni per inizializzare la listaRegistri
    }

    public Procedura() {
        this.listaIstruzioni = new ArrayList<>();
    }

    public Registro findOrAddRegistro(String nome) {
        Registro reg = this.listaRegistri.stream()
                .filter(registro -> nome.equals(registro.getNome()))
                .findAny()
                .orElse(new Registro(nome));
        if (!(this.listaRegistri.contains(reg))) this.addRegistro(reg);
        return reg;
    }


    @Override
    public int esegui() {
        for (Istruzione istruzione : listaIstruzioni) {
            int nuovoValore = istruzione.esegui();
            for (Operando operando : istruzione.getListaOperandi()) {
                if (operando instanceof Registro && listaRegistri.contains(operando)) {
                    listaRegistri.remove(operando);
                    listaRegistri.add(new Registro(((Registro) operando).getNome(), nuovoValore));
                }
            }
        }
        return 0;
    }


    @Override
    public String getNome() {
        return null;
    }

    public void addRegistro(Registro registro) {
        this.listaRegistri.add(registro);
    }

    public ArrayList<Registro> getListaRegistri() {
        return listaRegistri;
    }

    public void addIstruzione(Istruzione istruzione) {
        listaIstruzioni.add(istruzione);
    }

    public ArrayList<Istruzione> getListaIstruzioni() {
        return listaIstruzioni;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Istruzione istruzione : listaIstruzioni) {
            sb.append(istruzione.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
