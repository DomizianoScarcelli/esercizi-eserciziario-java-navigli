package Eserciziario.es214;

import java.util.ArrayList;

public abstract class Filtro {
    private ArrayList<Integer> listaInteri;

    public Filtro() {
        this.listaInteri = new ArrayList<>();
    }

    ;

    public Filtro(ArrayList<Integer> listaInteri) {
        this.listaInteri = listaInteri;
    }

    public ArrayList<Integer> getListaInteri() {
        return listaInteri;
    }

    public void setListaInteri(ArrayList<Integer> listaInteri) {
        this.listaInteri = listaInteri;
    }

    public abstract ArrayList<Integer> filtra() throws listaInteriNonDisponibileException;

    public abstract ArrayList<Integer> filtra(ArrayList<Integer> listaInteri);


}
