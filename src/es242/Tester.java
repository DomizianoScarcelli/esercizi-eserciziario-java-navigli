package es242;

public class Tester {
    public static void main(String[] args){
        VerificaStringhe v1 = (s1, s2) -> {
            return s1.contains(s2);
        };
        VerificaStringhe v2 = (s1, s2) -> {
          return ((s1.length() > s2.length()) &
                  !(s1.substring(0, s2.length()).equals(s2)));
        };

        System.out.println(v1.verifica("Bella", "Bolla"));
        System.out.println(v2.verifica("Bellona", "Bello"));
        System.out.println(v2.verifica("Bellona", "Belle"));
    }
}
