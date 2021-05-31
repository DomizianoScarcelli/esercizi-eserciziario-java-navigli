package DesignPatterns.Borsa;

import java.util.Observable;
import java.util.Observer;

public abstract class Analizzatore implements Observer {

    public abstract void analizza(Transazione t);

    @Override
    public void update(Observable o, Object arg) {
        this.analizza((Transazione) arg);
        System.out.println(this);

    }

}
