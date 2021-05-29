package es312;

import java.util.Iterator;

public class MyArray implements Iterable<String> {
    private String a[];

    public MyArray(String... a) {
        this.a = a;
    }

    public String[] getA() {
        return this.a;
    }


    @Override
    public Iterator<String> iterator() {
        return new MyArrayIterator(this.a);
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() != this.getClass()) {
            return false;
        } else if (this.a.length != ((MyArray) other).getA().length) {
            return false;
        } else {
            for (int i = 0; i < this.a.length; i++) {
                if (!this.a[i].equals(((MyArray) other).getA()[i])) return false;
            }
            return true;
        }
    }

    public class MyArrayIterator implements Iterator<String> {
        private int index;
        private String strings[];

        MyArrayIterator(String[] strings) {
            this.strings = strings;
        }

        @Override
        public boolean hasNext() {
            return !(this.strings.length == index);
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return strings[index++];
            } else {
                return null;
            }
        }

        public void reset() {
            this.index = 0;
        }


    }

    public static void main(String args[]) {
        MyArray array1 = new MyArray("Marcopinetto", "c'ha il mento", "chiuso", "come un baule");
//        for (String stringa : array1) {
//            System.out.println(stringa);
//        }
        MyArray array2 = new MyArray("Marcopinetto", "c'ha il mento", "chiuso", "come un baule");
        System.out.println(array1.equals(array2));
    }
}
