package Polymorphism.UpCasting_RuntimePolymorphism;

// Runtime polymorphism can't be achieved by data members.
/**
 * the s1 variable is of type Shape, but it is referring to an object of the
 * Circle class. This is allowed because Circle is a subclass of Shape.
 * Since method invocation is determined by the JVM not compiler, it is known as
 * runtime polymorphism.
 * 
 * 
 */
public class App {
    public static void main(String[] args) {
        Shape s1 = new Circle(); // upcasting
        Shape s2 = new Rectangle(); // upcasting

        s1.draw();
        s2.draw();
        /**
         * Since we are accessing the data member which is not overridden, hence it will
         * access the data member of the Parent class always.
         */
        System.out.println(s2.width); // Runtime polymorphism can't be achieved by data members.
    }
}
