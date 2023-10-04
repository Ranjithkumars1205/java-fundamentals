package CoreJavaConcepts.JavaBasics.ExceptionHandling.MethodOverridingException.SuperClassMethodNotDeclareException;

/**
 * If the superclass method declares an exception, subclass overridden method
 * can declare the same subclass exception or no exception but cannot declare
 * parent exception.
 */
public class App extends Parent {
    // We can't declare the normal exception when we declared Checked and unchecked
    // exception in the super class. But once we declare normal exception in the
    // superclass, we can use checked and unchecked exception in the child class.
    // void msg() throws Exception {
    // System.out.println("child method");
    // }

    // we can use same exception in subclass
    void msg() throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        Parent p = new App();

        try {
            p.msg();
        } catch (Exception e) {
        }

    }

}

class Parent {
    void msg() throws ArithmeticException {
        System.out.println("parent method");
    }
}
