package es323;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultiMappa<K, V> {
    private ArrayList<Mappa<K, V>> listaMappe;

    public MultiMappa(){
        this.listaMappe = new ArrayList<>();
    }

    public MultiMappa(ArrayList<Mappa<K, V>> listaMappe){
        this.listaMappe = listaMappe;
    }

    /*
    Presa in input una chiave e un valore, aggiunge l’associazione alla multimappa,
    restituendo true se il valore non era già contenuto nell’insieme associato alla chiave,
    false altrimenti. Il metodo gestisce la situazione in cui la chiave specificata non esista,
    creando la nuova associazione.
     */
    public boolean put(K key, V value){
        for (Mappa mappa : listaMappe){
            if (mappa.getKey().equals(key)) {
                for (Object mapValue : mappa.getValues()) {
                    if (!mapValue.equals(value)) {
                        mappa.putValue(value);
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        listaMappe.add(new Mappa<>(key, value));
        return true;
    }
    /*
    presa in input una chiave, se la chiave è presente
    restituisce l’insieme ad essa associato, altrimenti restituisce null.
     */
    public ArrayList<V> get(K key){
        for (Mappa mappa : listaMappe){
            if (mappa.getKey().equals(key)) {
                return mappa.getValues();
            }
        }return null;
    }

    public boolean contains(K key, V values){
        for (Mappa mappa : listaMappe){
            if (mappa.getKey().equals(key) & (mappa.getValues().equals(values))) return true;
        }return false;
    }

    public void intersect(K key, ArrayList<V> set) throws IllegalArgumentException{
        for (Mappa mappa : listaMappe){
            if (mappa.getKey().equals(key)) {
                for (V value : set) {
                    if (!mappa.getValues().contains(value)) mappa.putValue(value);
                }
            }
            if (mappa.getKey().equals(null)) {
                listaMappe.remove(mappa);
            }
        } throw new IllegalArgumentException(); //aggiusta sta cosa che così lancia sempre e comunque questa eccezione.
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Mappa mappa : listaMappe) stringBuilder.append(mappa + "\n");
        return stringBuilder.toString();
    }

}

