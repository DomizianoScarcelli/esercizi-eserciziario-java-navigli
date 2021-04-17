package es217;

public class Mov extends IstruzioneBinaria {

    public Mov(Operando r1, Operando r2) {
        this.setR1(r1);
        this.setR2(r2);
    }

    @Override
    public int esegui() {
        int nuovoValore = this.getR2().getValue();
        this.getR1().setValue(nuovoValore);
        return nuovoValore;
    }

    @Override
    public String getNome() {
        return "MOV";
    }


}
