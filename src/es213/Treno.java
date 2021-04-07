package es213;

import java.util.ArrayList;

public class Treno {
    private ArrayList<Vagone> vagoni = new ArrayList<>();

    public Treno(Locomotiva locomotiva){
        this.aggiungiVagone(locomotiva);
    }

    public void aggiungiVagone(Vagone vagone) {
        vagoni.add(vagone);
    }

    public void dividiTreno(int k, Locomotiva locomotiva) {
        Treno treno = new Treno(locomotiva);
        for (int i = 0; i < vagoni.size() - k; i++) {
            treno.aggiungiVagone(this.vagoni.get(k));
            vagoni.remove(k);
        }
        System.out.println(treno.toString());
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Vagone vagone : vagoni){
            stringBuilder.append(vagone.toString());
            stringBuilder.append("--");
        }
        return stringBuilder.toString();
    }
}