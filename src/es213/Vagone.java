package es213;

import java.util.ArrayList;

public class Vagone {
    public String destinazione;
    private final int POSTI_LIBERI;
    private ArrayList<Passeggero> elencoPasseggeri = new ArrayList<>();

    public Vagone(final int POSTI_LIBERI){
        this.POSTI_LIBERI = POSTI_LIBERI;
    }

    public void occupa(Passeggero passeggero) throws postiNonDisponibiliException, passeggeroNonAmmessoException{
        try {
            if (elencoPasseggeri.size() >= POSTI_LIBERI) throw new postiNonDisponibiliException();
            else {
                elencoPasseggeri.add(passeggero);
                System.out.println("Passeggero" + passeggero.getNome() + "registrato");
            }
        } catch (postiNonDisponibiliException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Passeggero> getElencoPasseggeri() {
        return elencoPasseggeri;
    }

    public int getPOSTI_LIBERI() {
        return POSTI_LIBERI;
    }

    public int getNumeroPostiLiberi() {
        return this.POSTI_LIBERI;
    }
}
