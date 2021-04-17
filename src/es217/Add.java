package es217;

public class Add extends IstruzioneBinaria {
    public Add(Operando r1, Operando r2) {
        this.setR1(r1);
        this.setR2(r2);
    }

    @Override
    public int esegui() {
        int nuovoValore = this.getR1().getValue() + this.getR2().getValue();
        this.getR1().setValue(nuovoValore);
        return nuovoValore;
    }

    @Override
    public String getNome() {
        return "ADD";
    }



    /*
    public static void main(String[] args) {
        Registro r1 = new Registro("Arco", 10);
        Intero int1 = new Intero(15);
        Add istruzioneAdd = new Add(r1, int1);
        System.out.println(istruzioneAdd.toString());
        istruzioneAdd.esegui();
        System.out.println(istruzioneAdd.toString());
    }
     */
}
