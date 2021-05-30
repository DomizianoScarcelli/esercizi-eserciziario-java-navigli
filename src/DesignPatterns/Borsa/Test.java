package DesignPatterns.Borsa;

public class Test {

    public static void main(String[] args) {
        Borsa borsa = Borsa.getInstance();
        Analizzatore analizzatore1 = new AnalizzatoreStatistiche();
        Analizzatore analizzatore2 = new AnalizzatoreTrend();

        borsa.addObserver(analizzatore1);
        borsa.addObserver(analizzatore2);

        borsa.nuovaTransazione(new Transazione( "Google", 10.56));
        System.out.println(analizzatore1);
        System.out.println(analizzatore2);

        borsa.nuovaTransazione(new Transazione( "Apple", 122.56));
        System.out.println(analizzatore1);
        System.out.println(analizzatore2);

        borsa.nuovaTransazione(new Transazione( "Tesla", 130.56));
        System.out.println(analizzatore1);
        System.out.println(analizzatore2);

        borsa.nuovaTransazione(new Transazione( "DOGE", 144.56));
        System.out.println(analizzatore1);
        System.out.println(analizzatore2);

    }
}
