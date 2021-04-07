package es341_344;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args){
        ArrayList<String> listaStringhe = new ArrayList<>(Arrays.asList("Marcolello", "Marcopino", "Marcopinello", "Io", "Tuo", "Egli"));
        ArrayList<String> listaPreJava8 = StringPreJava8.primeTreStringhe(listaStringhe, 3);
        ArrayList<String> listaPostJava8 = StringPostJava8.primeTreStringhe(listaStringhe, 3);

        System.out.println("Pre-Java 8 :" + listaPreJava8.toString());
        System.out.println("Post-Java 8 :" + listaPostJava8.toString());


    }
}
