package DesignPatterns.Borsa;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

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










