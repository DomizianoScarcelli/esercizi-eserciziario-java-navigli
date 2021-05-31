package Eserciziario.es214;

import java.util.ArrayList;

public class FiltroDispari extends Filtro {

    public FiltroDispari() {
        super();
    }

    public FiltroDispari(ArrayList<Integer> listaInteri) {
        super(listaInteri);
    }

    @Override
    public ArrayList<Integer> filtra() throws listaInteriNonDisponibileException {
        if (super.getListaInteri().size() == 0) throw new listaInteriNonDisponibileException();
        ArrayList<Integer> listaFiltrata = new ArrayList<Integer>();
        for (int i = 0; i < super.getListaInteri().size(); i += 2) {
            listaFiltrata.add(super.getListaInteri().get(i));
        }
        return listaFiltrata;
    }

    @Override
    public ArrayList<Integer> filtra(ArrayList<Integer> listaInteri) {
        try {
            super.setListaInteri(listaInteri);
            return this.filtra();
        } catch (listaInteriNonDisponibileException e) {
            e.printStackTrace();
            return listaInteri;
        }
    }
}
