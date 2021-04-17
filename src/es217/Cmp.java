package es217;

public class Cmp extends IstruzioneBinaria {
    public Cmp(Operando r1, Operando r2) {
        this.setR1(r1);
        this.setR2(r2);
    }

    @Override
    public int esegui() {
        if (this.getR1().getValue() == this.getR2().getValue()) {
            this.getR1().setValue(0);
            return 0;
        }
        if (this.getR1().getValue() < this.getR2().getValue()) {
            this.getR1().setValue(-1);
            return -1;
        }
        this.getR1().setValue(1);
        return 1;
    }

    @Override
    public String getNome() {
        return "CMP";
    }


}
