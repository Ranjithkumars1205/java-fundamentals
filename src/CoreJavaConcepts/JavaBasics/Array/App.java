package CoreJavaConcepts.JavaBasics.Array;

/**
 * A Java array is a fixed-size, ordered collection of elements of the same data
 * type. Each element in the array is identified by an index, starting from 0
 * for the first element and increasing by 1 for each subsequent element. Arrays
 * in Java are used to store and manipulate multiple values of the same data
 * type efficiently.
 */
public class App {
    public static void main(String[] args) {
        // int[] a = new int[5];
        // a[0] = 33;
        int a[] = { 33, 3, 4, 5 };

        for (int i : a) {
            System.out.println(i);
        }
    }

}
