package es341_344;

import java.util.*;
import java.util.stream.*;


public class StringPostJava8 {

    @FunctionalInterface
    interface Interface342{
        public Boolean compare(String s1, String s2);
    }

    public static ArrayList<String> primeTreStringhe(ArrayList<String> listaStringhe, int k){
        ArrayList<String> primeTreStringheK = new ArrayList<>(listaStringhe.stream()
                    .filter(s -> s.length() >= k)
                    .collect(Collectors.toList()));
        return primeTreStringheK;
    }

    public static ArrayList<String> es342(ArrayList<String> listaStringhe, int k){
        Interface342 func = (s1, s2) -> {
            Set<String> setS2 = new HashSet<>();
            Set<String> setS1 = new HashSet<>();
            for (char carattere : s1.toCharArray()){
                setS1.add(Character.toString(carattere));
            }
            for (char carattere : s2.toCharArray()){
                setS2.add(Character.toString(carattere));
            }
            setS1.retainAll(setS2);
            return (setS1.size() >= 3);
        };

        listaStringhe.stream()
                .forEach( string1 ->{
                    listaStringhe.stream().
                            forEach(string2 ->{
                                func.compare(string1, string2);
                            });
                });
        return listaStringhe;
    }










}
