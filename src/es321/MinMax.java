package es321;

public class MinMax<T extends Comparable<T>>{
    private T min;
    private T max;

    public MinMax(T min, T max){
        this.min = min;
        this.max = max;
    }

    public T getMax() {
        return max;
    }

    public T getMin() {
        return min;
    }

    @Override
    public String toString(){
        return ("Min: " + min + ", Max: " + max);
    }
}
