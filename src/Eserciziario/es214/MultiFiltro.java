package Eserciziario.es214;

import java.util.ArrayList;

public class MultiFiltro extends Filtro {
    private Filtro[] listaFiltri;

    public MultiFiltro(Filtro... listaFiltri) {
        super();
        this.listaFiltri = listaFiltri;
    }


    @Override
    public ArrayList<Integer> filtra() throws listaInteriNonDisponibileException {
        for (Filtro filtro : listaFiltri) {
            super.setListaInteri(filtro.filtra());
            filtro.setListaInteri(super.getListaInteri());

        }
        return super.getListaInteri();
    }

    @Override
    public ArrayList<Integer> filtra(ArrayList<Integer> listaInteri) {
        for (Filtro filtro : this.listaFiltri) {
            super.setListaInteri(filtro.filtra(listaInteri));
        }
        return super.getListaInteri();
    }
}
