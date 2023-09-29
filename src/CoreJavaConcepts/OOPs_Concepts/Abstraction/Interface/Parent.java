package CoreJavaConcepts.OOPs_Concepts.Abstraction.Interface;

public class Parent implements Human, God {
    // private Child child;
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
        // The final field Human.saySomething cannot be assignedJava(33554512)
        // saySomething = "happy Day!";
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
