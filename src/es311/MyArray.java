package es311;


import java.util.Arrays;
/*
Non funziona un caz perchè so stupido e gli array non sono iterabili e
non mi va di modificare ora il metodo compareTo però un giorno lo faccio
perchè comunque non è un esercizio proprio facilissimo ciao.
 */
public class MyArray implements Comparable<Integer[]>{
    private int[] interi;

    public MyArray(int... interi){ this.interi = interi;};

    @Override
    public int compareTo(Integer[] o) {
        if (this.interi.length > o.length) return 1;
        else if (this.interi.length < o.length) return -1;
        else{
            for (int i : this.interi){
                for (int j : o){
                    if (i == j) continue;
                    else if (i > j) return 1;
                    else return -1;
                }
            } return 0;
        }
    }

    public static void main(String[] args){
        MyArray myArray = new MyArray(new int[] {4,7,3,6});
        MyArray myArray1 = new MyArray(new int[] {3,6,4,2});
        MyArray[] insiemeArrays = new MyArray[] {myArray, myArray1};
        System.out.println(insiemeArrays);
        Arrays.sort(insiemeArrays);
        System.out.println(insiemeArrays);
    }
}
