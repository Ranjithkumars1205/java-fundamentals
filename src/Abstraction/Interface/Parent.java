package Abstraction.Interface;

public class Parent implements Human, God {
    // private Child child;
    // String saySomething = "happy Day!";
    int age;
    private final String role = "Mother"; // final variable means constant variable

    public Parent(String name, int age, String occupation) {
        // super(name, age, occupation);
        this.age = age;
        Human.getName(name);
    }

    // void setChild(Child child) {
    // this.child = child;
    // }

    @Override
    public void introduce() {
        System.out.println("i'm " + name + " and " + "I'm " + role + " of him");
    }

    public void sayHello() {
        System.out.println("Hello Guys! " + "I'm " + name + "! " + "and " + age + " years old! ");
    }

    @Override
    public void doDaily() {
        System.out.println(role + ": Take healthy food, work consistently,");
    }

    @Override
    public String toString() {
        return "Parent [role=" + role + "]";
    }

    public void sleep() {
        System.out.println("Get 8 hours of sleep daily!");
    }
}
