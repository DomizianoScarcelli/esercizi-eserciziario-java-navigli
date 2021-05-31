package Eserciziario.es213;

public class Test {

    public static void main(String[] args){
        Locomotiva locomotiva = new Locomotiva();
        Treno treno = new Treno(locomotiva);
        VagoneLetto vagoneLetto = new VagoneLetto();
        VagonePasseggeri vagonePasseggeri = new VagonePasseggeri();
        VagoneMerci vagoneMerci = new VagoneMerci();
        treno.aggiungiVagone(vagonePasseggeri);
        treno.aggiungiVagone(vagoneLetto);
        treno.aggiungiVagone(vagoneMerci);
        System.out.println(treno.toString());
        Passeggero passeggero = new Passeggero("Marcolello");
        PasseggeroAssonnato passeggeroAssonnato = new PasseggeroAssonnato();

    }
}
