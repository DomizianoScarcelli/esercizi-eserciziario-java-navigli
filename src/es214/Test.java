package es214;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws listaInteriNonDisponibileException {
        ArrayList<Integer> listaInteri = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 6, 4, 5, 6, 4, 5, 6));
        FiltroIntero filtroIntero4 = new FiltroIntero(listaInteri, 4);
        //System.out.println(filtroIntero4.filtra(););
        FiltroPrimo filtroPrimo = new FiltroPrimo(listaInteri);
        //System.out.println(filtroPrimo.filtra());
        FiltroDispari filtroDispari = new FiltroDispari(listaInteri);
        //System.out.println(filtroDispari.filtra());
        MultiFiltro multiFiltro = new MultiFiltro(filtroIntero4, filtroPrimo, filtroDispari); //Non funziona non mi viene in mente il modo in cui farlo
        System.out.println(multiFiltro.filtra());
    }
}
