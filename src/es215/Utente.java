package es215;

import es215.exceptions.ListaAmiciPrivataException;
import es215.exceptions.UtenteGiaAmicoException;

import java.util.ArrayList;

public class Utente {
    private String nome;
    private String cognome;
    private ArrayList<Utente> listaAmici;
    private boolean statoPrivacy;
    private ArrayList<RichiestaAmicizia> richiesteAmiciziaPendenti;

    Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.listaAmici = new ArrayList<>();
        this.richiesteAmiciziaPendenti = new ArrayList<>();
        this.statoPrivacy = false;
    }

    public ArrayList<Utente> getAmiciDi(Utente utente) throws ListaAmiciPrivataException {
        if (utente.getStatoPrivacy()) {
            if (utente.getListaAmici().contains(this)) {
                return utente.getListaAmici();
            } else {
                throw new ListaAmiciPrivataException();
            }
        } else throw new ListaAmiciPrivataException();
    }

    public void richiediAmicizia(Utente otherUtente) throws UtenteGiaAmicoException {
        if (!this.listaAmici.contains(otherUtente)) {
            RichiestaAmicizia richiestaAmicizia = new RichiestaAmicizia(this, otherUtente);
            otherUtente.getRichiesteAmiciziaPendenti().add(richiestaAmicizia);
        } else throw new UtenteGiaAmicoException();
    }


    public void accettaAmicizia(RichiestaAmicizia richiestaAmicizia) {
        Utente fromUtente = richiestaAmicizia.getFromUtente();
        this.listaAmici.add(fromUtente);
        this.richiesteAmiciziaPendenti.remove(richiestaAmicizia);
        fromUtente.getListaAmici().add(this);
    }


    ///Getters and Setters

    public ArrayList<Utente> getListaAmici() {
        return this.listaAmici;
    }

    public boolean getStatoPrivacy() {
        return this.statoPrivacy;
    }

    public void setStatoPrivacy(boolean stato) {
        this.statoPrivacy = stato;
    }

    public ArrayList<RichiestaAmicizia> getRichiesteAmiciziaPendenti() {
        return richiesteAmiciziaPendenti;
    }
}
