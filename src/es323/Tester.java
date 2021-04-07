package es323;

public class Tester {

    public static void main(String[] args){
        MultiMappa<Integer, String> multiMappa = new MultiMappa<>();
        multiMappa.put(5, "Dajone");
        System.out.println(multiMappa);
        multiMappa.put(7, "Marcolello");
        multiMappa.put(5, "Marconcello");
        System.out.println(multiMappa);

    }
}
