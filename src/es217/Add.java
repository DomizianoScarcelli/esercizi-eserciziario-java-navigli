package es217;

public class Add extends IstruzioneBinaria {
    public Add(Operando r1, Operando r2) {
        this.setR1(r1);
        this.setR2(r2);
    }

    @Override
    public void esegui() {
        this.getR1().setValue(
                this.getR1().getValue() + this.getR2().getValue()
        );
    }
}
