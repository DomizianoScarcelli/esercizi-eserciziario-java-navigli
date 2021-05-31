package Eserciziario.es341_344;

import java.util.ArrayList;

public class StringPreJava8 {


    public static ArrayList<String> primeTreStringhe(ArrayList<String> listaStringhe, int k){
        ArrayList<String> primeTreStringheK = new ArrayList<>();
        for (String stringa : listaStringhe) {
            if (stringa.length() >= k) primeTreStringheK.add(stringa);
        }
        return primeTreStringheK;
    }

}
