package es243;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        FunzioneSuInsieme funzione1 = (ints, k) -> {
            int sum = 0;
            for (int i : ints){
                if (i <= k) sum += i;
            }
            return sum;
        };

        FunzioneSuInsieme funzione2 = (ints, k) -> {
            if (ints.length == 0) return -1;
            else {
                Arrays.sort(ints);
                return ints[0];
            }
        };

        System.out.println(funzione1.applica(new int[]{1, 2, 3, 4, 5, 6}, 4));
        System.out.println(funzione2.applica(new int[]{1, 2, 3, 4, 5, 6}, 4));
        System.out.println(funzione2.applica(new int[]{}, 4));


    }
}
