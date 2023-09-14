package Abstraction.AbstractClass;

/**
 * We must be implement the abstract methods for both abstract classes and
 * interfaces as soon as we extending them with class.
 * If you are extending an abstract class that has an abstract method, you must
 * either provide the implementation of the method or make this class abstract
 * or Interface (check IHuman interface file)
 */

public class Parent extends Human {

    // private Child child;

    private final String role = "parent";

    public Parent(String name, int age, String occupation) {
        super(name, age, occupation);
    }

    @Override
    public void introduce() {
        System.out.println("i'm " + name + " and " + "I'm " + role + " of them");
    }

    @Override
    void sayHello() {
        System.out.println("Hello Guys! " + "I'm " + name + "! " + "and " + age + " years old! ");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating by " + role);
    }

    @Override
    public String toString() {
        return "Parent [role=" + role + "]";
    }

}
