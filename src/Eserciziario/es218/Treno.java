package Eserciziario.es218;

public abstract class Treno {
    private boolean statoPorte;
    private int velocita;
    
    public Treno() {
        this.statoPorte = false;
        this.velocita = 0;
    }

    public void frena() {
        this.velocita = 0;
    }

    public void entraInStazione() {
        this.frena();
    }

    public void setStatoPorte(boolean statoPorte) {
        this.statoPorte = statoPorte;
    }

}
