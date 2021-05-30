package DesignPatterns.ArrayComparabile;

import java.util.Comparator;

public abstract class MetodoDiComparazione<T> implements Comparator<ArrayComparabile<T>> {
    @Override
    public abstract int compare(ArrayComparabile<T> o1, ArrayComparabile<T> o2);
}
