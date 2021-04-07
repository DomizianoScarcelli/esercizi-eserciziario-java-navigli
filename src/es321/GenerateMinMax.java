package es321;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class GenerateMinMax {

    public static <T extends Comparable<T>> MinMax<T> getMinMax(Collection<T> collection){
        T min = (T) Collections.min(collection);
        T max = (T) Collections.max(collection);
        return new MinMax<T>(min, max);
    }

    public static void main(String[] args){
        MinMax<String> minMax = getMinMax(Arrays.asList("ciao", "aaa", "bb", "aabb", "zzz"));
        System.out.println(minMax);
    }
}
