package DesignPatterns.ArrayComparabile;

public class OrdineDimensionale<T extends Comparable<T>> extends MetodoDiComparazione<T> {
    @Override
    public int compare(ArrayComparabile<T> o1, ArrayComparabile<T> o2) {
        T[] array1 = o1.getData();
        T[] array2 = o2.getData();
        return Integer.compare(array1.length, array2.length);
    }
}

