package Streams.es341_344;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = StringMethods.stringsBiggerThanNum(new ArrayList<>(Arrays.asList("Marcoletto", "Pino", "Marcoz", "Ginevro")), 3, 6);
        System.out.println(strings);
        ArrayList<Integer> lenMap = StringMethods.mapStringsToLen(new ArrayList<>(Arrays.asList("Marcoletto", "Pino", "Marcoz", "Ginevro")));
        System.out.println(lenMap);
        ArrayList<Integer> sortedLenMap = StringMethods.sortedMapStringsToLen(new ArrayList<>(Arrays.asList("Marcoletto", "Pino", "Marcoz", "Ginevro")));
        System.out.println(sortedLenMap);
        Map<Integer, String> mapLentoStrings = StringMethods.mapLentoStrings(new ArrayList<>(Arrays.asList("Marcoletto", "Pino", "Marcoz", "Ginevro")));
        System.out.println(mapLentoStrings);

    }
}
