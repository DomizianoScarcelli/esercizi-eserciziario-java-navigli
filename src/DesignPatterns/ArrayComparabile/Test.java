package DesignPatterns.ArrayComparabile;

public class Test {

    public static void main(String[] args) {
        OrdineDimensionale<Integer> ordineDimensionale = new OrdineDimensionale<>();
        OrdineLessicografico<Integer> ordineLessicografico = new OrdineLessicografico<>();
        OrdineLessicograficoInverso<Integer> ordineLessicograficoInverso = new OrdineLessicograficoInverso<>();
        ArrayComparabile<Integer> array1 = new ArrayComparabile<>(ordineLessicografico, 1, 2, 45, 2, 5, 6);
        ArrayComparabile<Integer> array2 = new ArrayComparabile<>(ordineLessicografico, 1, 2, 45, 2, 5, 7);
        ArrayComparabile<Integer> array3 = new ArrayComparabile<>(ordineLessicografico, 1, 2, 45, 2, 4, 7);

        System.out.println(array1.compareTo(array2));
        System.out.println(array1.compareTo(array3));
        System.out.println(array2.compareTo(array1));
        System.out.println(array2.compareTo(array3));


    }
}
