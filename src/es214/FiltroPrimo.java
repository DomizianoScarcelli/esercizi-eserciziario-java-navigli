package es214;

import java.util.ArrayList;

public class FiltroPrimo extends Filtro {

    public FiltroPrimo() {
        super();
    }


    public FiltroPrimo(ArrayList<Integer> listaInteri) {
        super(listaInteri);
    }


    @Override
    public ArrayList<Integer> filtra() throws listaInteriNonDisponibileException {
        if (this.getListaInteri().size() == 0) throw new listaInteriNonDisponibileException();
        FiltroIntero filtroIntero = new FiltroIntero(super.getListaInteri(), super.getListaInteri().get(0));
        return filtroIntero.filtra();
    }

    @Override
    public ArrayList<Integer> filtra(ArrayList<Integer> listaInteri) {
        FiltroIntero filtroIntero = new FiltroIntero(listaInteri, listaInteri.get(0));
        try {
            return filtroIntero.filtra();
        } catch (listaInteriNonDisponibileException e) {
            return listaInteri;
        }
    }
}
