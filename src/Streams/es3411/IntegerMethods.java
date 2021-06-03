package Streams.es3411;

import java.util.stream.IntStream;

public class IntegerMethods {

    public static void printFirstNumbers(int num){
        IntStream.rangeClosed(0, num)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        IntegerMethods.printFirstNumbers(10000);
    }
}
