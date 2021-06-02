package DesignPatterns.Borsa;

public class TransazioneChargeFactory implements TransazioneFactory {
    public static double getCharge(){
        return 4;
    }
    @Override
    public Transazione createTransazione(String compagnia, double importo) {
        return new Transazione() {
            @Override
            public String getCompagnia() {
                return compagnia;
            }

            @Override
            public double getImporto() {
                return importo - (importo * (TransazioneChargeFactory.getCharge()/100));
            }
        };
    }
}
