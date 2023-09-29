package CoreJavaConcepts.OOPs_Concepts.Polymorphism.StaticBindingVsDynamicBinding;

/**
 * When type of the object is determined at compiled time(by the compiler), it
 * is known as static binding.
 * If there is any private, final or static method in a class, there is static
 * binding.
 */
public class StaticBinding {
    private void eat() {
        System.out.println("Static Binding");
    }

    public static void main(String args[]) {
        StaticBinding d1 = new StaticBinding(); // When type of the object is determined at compiled time
        d1.eat();
    }

}
