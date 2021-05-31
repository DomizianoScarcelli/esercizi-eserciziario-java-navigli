package DesignPatterns.ScrittoreDiLibri;

import DesignPatterns.ScrittoreDiLibri.Scrittori.Fumettista;
import DesignPatterns.ScrittoreDiLibri.Scrittori.ScrittoreDiAvventura;
import DesignPatterns.ScrittoreDiLibri.Scrittori.ScrittoreDiGialli;

public class Test {

    public static void main(String[] args) {
        Fumettista fumettista = new Fumettista();
        ScrittoreDiAvventura scrittoreDiAvventura = new ScrittoreDiAvventura();
        ScrittoreDiGialli scrittoreDiGialli = new ScrittoreDiGialli();
        fumettista.pubblica("Il fumettone 1");
        scrittoreDiGialli.pubblica("Giallone 1");
        scrittoreDiAvventura.pubblica("Megavventura");
        System.out.println(fumettista);
        System.out.println(scrittoreDiAvventura);
        System.out.println(scrittoreDiGialli);
    }
}
