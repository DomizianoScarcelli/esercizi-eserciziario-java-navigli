package Eserciziario.es323;
import java.util.ArrayList;

public class Mappa<K, V> {
    private K key;
    private ArrayList<V> values = new ArrayList<>();

    public Mappa(K key, V... values){
        this.key = key;
        for (V value : values){
            this.values.add(value);
        }
    }

    public ArrayList<V> getValues() {
        return this.values;
    }

    public void putValue(V value){
        this.values.add(value);
    }

    public void removeKey(K key){

    }

    public K getKey() {
        return key;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(key + ": ");
        for (V value : values) stringBuilder.append(value + " ");
        return stringBuilder.toString();
    }
}
