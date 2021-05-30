package DesignPatterns.Borsa;

import java.util.Observable;

public class AnalizzatoreTrend extends Analizzatore {
    private Transazione ultimaTransazione;
    private double trendImporto;

    @Override
    public void update(Observable o, Object transazione) {
        if (ultimaTransazione == null) trendImporto = ((Transazione) transazione).getImporto();
        else trendImporto = ((Transazione) transazione).getImporto() - ultimaTransazione.getImporto();

        ultimaTransazione = (Transazione) transazione;
    }

    @Override
    public String toString() {
        return "Trend = " + trendImporto;
    }
}
