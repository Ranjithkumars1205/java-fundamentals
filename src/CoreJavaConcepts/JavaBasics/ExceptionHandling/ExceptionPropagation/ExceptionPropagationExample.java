package CoreJavaConcepts.JavaBasics.ExceptionHandling.ExceptionPropagation;

/***
 * In this example, we have three methods: method1, method2, and method3. Each
 * method calls the next one in sequence. method3 throws an exception. Instead
 * of handling the exception within method3, it declares that it throws an
 * exception using the throws keyword.
 * 
 * The exception thrown in method3 is then propagated up the call stack to
 * method2, and then to method1, and finally caught and handled in the main
 * method using a try-catch block.
 */

public class ExceptionPropagationExample {

    public static void method3() throws Exception {
        // we must throws an exception using the throws keyword.
        throw new Exception("Exception in method3");
    }

    public static void method2() throws Exception {
        // we must throws an exception using the throws keyword.
        method3();
    }

    public static void method1() throws Exception {
        // we must throws an exception using the throws keyword.
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}
