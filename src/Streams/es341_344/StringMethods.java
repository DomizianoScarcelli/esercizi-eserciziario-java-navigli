package Streams.es341_344;

import java.util.*;
import java.util.stream.Collectors;

public class StringMethods {
    /**
     * Data una lista di stringhe, scrivere un metodo che restituisca
     * una lista delle prime numStrings stringhe nella lista di dimensione ≥ num e contenenti almeno
     * due caratteri differenti.
     */
    public static ArrayList<String> stringsBiggerThanNum(ArrayList<String> stringList, Integer numStrings, Integer num){
        return stringList.stream()
                .filter((str) -> str.length() >= num)
                .limit(numStrings)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Scrivere un metodo che, data in input una lista di stringhe,
     * restituisca l’insieme delle lunghezze delle stringhe nella lista
     */
    public static ArrayList<Integer> mapStringsToLen(ArrayList<String> strList){
        return strList.stream()
                .map((str) -> str.length())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Scrivere un metodo che, data in input una lista di stringhe,
     * restituisca l’insieme ordinato della lunghezza delle stringhe nella lista.
     */
    public static ArrayList<Integer> sortedMapStringsToLen(ArrayList<String> strList){
        return mapStringsToLen(strList).stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Scrivere un metodo che, data in input una lista di stringhe,
     * restituisca una mappa da lunghezza a stringhe di tale lunghezza, con chiavi
     * ordinate per lunghezza
     */
    public static Map<Integer, String> mapLentoStrings(ArrayList<String> strList){
        return strList.stream()
                .collect(Collectors.toMap(String::length, String::toString, (v1, v2) -> v1));
    }



}
