package es218;

public class TAV extends Treno {

    public TAV() {
        super();
    }

    @Override
    public void entraInStazione() {
        super.entraInStazione();
        super.setStatoPorte(true);
    }

}
