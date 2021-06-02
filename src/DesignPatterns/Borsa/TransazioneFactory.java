package DesignPatterns.Borsa;

public interface  TransazioneFactory {
    Transazione createTransazione(String compagnia, double importo);

}
