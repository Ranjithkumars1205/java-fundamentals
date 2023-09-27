package Encapsulation.GetterSetterMethod;

/**
 * By providing only a setter or getter method, you can make the class read-only
 * or write-only.
 * It is a way to achieve data hiding in Java because other class will not be
 * able to access the data through the private data members.
 */

public class App {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.setName("Ranjith");
        System.out.println(d.getName());
    }

}
