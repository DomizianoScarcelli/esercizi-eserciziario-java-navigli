package Eserciziario.es311;


/*
Non funziona un caz perchè so stupido e gli array non sono iterabili e
non mi va di modificare ora il metodo compareTo però un giorno lo faccio
perchè comunque non è un esercizio proprio facilissimo ciao.
 */
public class MyArray implements Comparable<MyArray> {
    private int[] interi;

    public MyArray(int... interi) {
        this.interi = interi;
    }

    public int[] getInteri() {
        return this.interi;
    }

    @Override
    public int compareTo(MyArray o) {
        if (this.interi.length > o.getInteri().length) return 1;
        else if (this.interi.length < o.getInteri().length) return -1;
        else {
            for (int i = 0; i < this.interi.length; i++) {
                if (this.interi[i] < o.getInteri()[i]) return -1;
                else if (this.interi[i] > o.getInteri()[i]) return 1;
            }
            return 0;
        }
    }


    public static void main(String[] args) {
        MyArray array1 = new MyArray(1, 3, 2, 3);
        MyArray array2 = new MyArray(1, 2, 3);
        System.out.println(array1.compareTo(array2) > 0);
    }
}
