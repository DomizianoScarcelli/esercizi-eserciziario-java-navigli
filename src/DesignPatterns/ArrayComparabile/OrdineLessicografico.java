package DesignPatterns.ArrayComparabile;

import java.util.Comparator;

public class OrdineLessicografico<T extends Comparable<T>> extends MetodoDiComparazione<T> {

    @Override
    public int compare(ArrayComparabile<T> o1, ArrayComparabile<T> o2) {
        T[] array1 = o1.getData();
        T[] array2 = o2.getData();
        if (array1.length > array2.length) return 1;
        else if (array1.length < array2.length) return -1;
        else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].compareTo(array2[i]) > 0) return 1;
                else if (array1[i].compareTo(array2[i]) < 0) return -1;
            }
            return 0;
        }
    }
}
