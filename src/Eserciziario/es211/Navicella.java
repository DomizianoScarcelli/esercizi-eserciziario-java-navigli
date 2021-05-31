package Eserciziario.es211;

public class Navicella extends Oggetto {
    private boolean stato;

    public Navicella() {
        super.x = 0;
        super.y = 2;
    }

    @Override
    public String toString() {
        return "N";
    }

    public void su() {
        super.y++;
    }

    public void giu() {
        super.y--;
    }

    public boolean getStato() {
        return this.stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }
}

