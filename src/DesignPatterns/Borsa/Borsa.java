package DesignPatterns.Borsa;

import java.util.Observable;

public class Borsa extends Observable {
    private static Borsa instance;

    public static Borsa getInstance() {
        if (instance == null) instance = new Borsa();
        return instance;
    }

    private Borsa(){}

    public void nuovaTransazione(Transazione t){
        setChanged();
        notifyObservers(t);
//        for (Analizzatore analizzatore : analizzatori) analizzatore.update(this, t);
    }
}










