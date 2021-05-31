package Eserciziario.es241;

public class Tester{


    public static void main(String[] args){
        ElaboraStringhe e = (string -> {
            return Integer.toString(string.length());
        });

        ElaboraStringhe e2 = (string -> {
           if (string.length() < 5) return string;
           else return string.substring(0, 5);
        });

        System.out.println(e.elabora("Dajone"));
        System.out.println(e2.elabora("Dajoncello"));



    }
}
