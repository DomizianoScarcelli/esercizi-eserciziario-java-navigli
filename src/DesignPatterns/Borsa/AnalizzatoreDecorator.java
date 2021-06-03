package DesignPatterns.Borsa;

public abstract class AnalizzatoreDecorator{

    protected Analizzatore analizzatore;

    public AnalizzatoreDecorator(Analizzatore analizzatore){
        this.analizzatore = analizzatore;
    }
}
