package DesignPatterns.Borsa;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.util.ArrayList;
import java.util.List;

public class AnalizzatoreStatistiche extends Analizzatore{

    private List<Transazione> transazioni = new ArrayList<>();


    @Override
    public String toString(){
        double importo = 0.0;
        for (Transazione t : transazioni) importo += t.getImporto();
        return "Importo medio delle transazioni = " + importo/transazioni.size();
    }

    @Override
    public void analizza(Transazione t) {
        transazioni.add(t);
    }
}
