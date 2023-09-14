package Abstraction.AbstractClass;

/**
 * We must be implement the abstract methods for both abstract classes and
 * interfaces as soon as we extending them with class.
 * If you are extending an abstract class that has an abstract method, you must
 * either provide the implementation of the method or make this class abstract
 * or Interface (check IHuman interface file)
 */

public class Child extends Human {
    private final String role = "child";
    private Parent parent;

    public Child(String name, int age, String occupation, Parent parent) {
        super(name, age, occupation);
        this.parent = parent;
    }

    @Override
    public void introduce() {
        System.out.println("i'm " + name + " and " + role + " of " + parent.name + ". I'm working as " + occupation);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating by " + role);
    }

    @Override
    void sayHello() {
        System.out.println("Hello Guys! " + "I'm " + name + "! " + "and " + age + " years old! ");
    }

    // Cannot override the final method from HumanJava(67109265)
    // @Override
    // void saySomething() {
    // }

    @Override
    public String toString() {
        return "Child [role=" + role + "]";
    }
}
