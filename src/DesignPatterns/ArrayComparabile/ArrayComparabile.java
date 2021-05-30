package DesignPatterns.ArrayComparabile;

public class ArrayComparabile<T> implements Comparable<ArrayComparabile<T>> {
    private T[] data;
    private MetodoDiComparazione<T> comparator;

    @SafeVarargs
    public ArrayComparabile(MetodoDiComparazione<T> comparator, T... data) {
        this.comparator = comparator;
        this.data = data;
    }

    @Override
    public int compareTo(ArrayComparabile<T> other) {
        return comparator.compare(this, other);
    }

    public void setComparator(MetodoDiComparazione<T> comparator) {
        this.comparator = comparator;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
}
