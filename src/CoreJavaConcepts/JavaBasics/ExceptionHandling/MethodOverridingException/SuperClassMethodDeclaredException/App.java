package CoreJavaConcepts.JavaBasics.ExceptionHandling.MethodOverridingException.SuperClassMethodDeclaredException;

import java.io.IOException;

/***
 * If the superclass method does not declare an exception, subclass overridden
 * method cannot declare the checked exception but it can declare unchecked
 * exception.
 */

public class App extends Parent {
    // overriding the method in child class
    // gives compile time error

    // void msg() throws IOException {
    // System.out.println("TestExceptionChild");
    // }

    void msg() throws ArithmeticException {
        System.out.println("TestExceptionChild");
    }

    public static void main(String args[]) {
        Parent p = new App();
        p.msg();
    }

}

class Parent {

    // defining the method
    void msg() {
        System.out.println("parent method");
    }
}
