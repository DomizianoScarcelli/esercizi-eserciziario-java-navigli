package DesignPatterns.Borsa;

public class Test {

    public static void main(String[] args) {
        Borsa borsa = Borsa.getInstance();
        AnalizzatoreStatistiche analizzatore1 = new AnalizzatoreStatistiche();
        AnalizzatoreTrend analizzatore2 = new AnalizzatoreTrend();
        borsa.addObserver(analizzatore1);
        borsa.addObserver(analizzatore2);
        TransazioneChargeFactory transazioneChargeFactory = new TransazioneChargeFactory();
        TransazioneNoChargeFactory transazioneNoChargeFactory = new TransazioneNoChargeFactory();
        borsa.nuovaTransazione(transazioneChargeFactory.createTransazione("Google", 10.05));
        borsa.nuovaTransazione(transazioneNoChargeFactory.createTransazione("Google No Charge", 10.05));

    }
}
