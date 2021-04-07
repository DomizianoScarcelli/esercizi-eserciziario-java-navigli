package es214;

import java.util.ArrayList;

public class FiltroIntero extends Filtro {
    private final int INTERO;

    public FiltroIntero(ArrayList<Integer> listaInteri, int intero) {
        super(listaInteri);
        this.INTERO = intero;
    }

    public FiltroIntero(int intero) {
        super();
        this.INTERO = intero;
    }

    public static void main(String[] args) {
    }

    @Override
    public ArrayList<Integer> filtra() throws listaInteriNonDisponibileException {
        ArrayList<Integer> listaFiltrata = new ArrayList<>();
        if (super.getListaInteri().size() == 0) throw new listaInteriNonDisponibileException();
        for (int intero : super.getListaInteri()) {
            if (intero != this.INTERO) {
                listaFiltrata.add(intero);
            }
        }
        return listaFiltrata;
    }

    @Override
    public ArrayList<Integer> filtra(ArrayList<Integer> listaInteri) {
        super.setListaInteri(listaInteri);
        try {
            return this.filtra();
        } catch (listaInteriNonDisponibileException e) {
            e.printStackTrace();
            return null;
        }
    }
}
