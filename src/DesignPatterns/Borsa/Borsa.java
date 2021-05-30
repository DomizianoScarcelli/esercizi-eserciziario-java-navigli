package DesignPatterns.Borsa;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Borsa extends Observable {
    private ArrayList<Analizzatore> analizzatori = new ArrayList<>();
    private static Borsa instance;

    public static Borsa getInstance() {
        if (instance == null) instance = new Borsa();
        return instance;
    }

    private Borsa(){}

    public void nuovaTransazione(Transazione t){
        for (Analizzatore analizzatore : analizzatori) analizzatore.update(this, t);
    }

    @Override
    public synchronized void addObserver(Observer o) {
        analizzatori.add((Analizzatore) o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        analizzatori.remove((Analizzatore) o);
    }

    @Override
    public void notifyObservers() {

    }
}










