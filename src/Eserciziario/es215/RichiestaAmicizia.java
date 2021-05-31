package Eserciziario.es215;

public class RichiestaAmicizia {
    private Utente fromUtente;
    private Utente toUtente;
    private boolean stato;

    RichiestaAmicizia(Utente fromUtente, Utente toUtente) {
        this.fromUtente = fromUtente;
        this.toUtente = toUtente;
        this.stato = false;
    }

    public Utente getFromUtente() {
        return fromUtente;
    }

    public Utente getToUtente() {
        return toUtente;
    }
}
