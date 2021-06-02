package DesignPatterns.Borsa;

public class TransazioneNoChargeFactory implements TransazioneFactory {
    @Override
    public Transazione createTransazione(String compagnia, double importo) {
        return new Transazione() {
            @Override
            public String getCompagnia() {
                return compagnia;
            }

            @Override
            public double getImporto() {
                return importo;
            }
        };
    }
}
