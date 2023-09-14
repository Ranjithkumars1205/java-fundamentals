package Abstraction.AbstractClass;

/**
 * If you want to define a contract without providing any implementation, you
 * should use interfaces in Java instead of abstract class.
 * It can't be instantiated
 */
abstract class Human implements IHuman {
    String name; // it can have data members
    int age;
    String gender;
    String occupation;
    static final String saySomething = "Have a blessed Day!"; // it can have final variables
    static int year = 1996; // it can have static variables

    // It can have constructor and even main method as well. But It can't be
    // instantiated.
    public Human(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        // this.gender = gender;
        this.occupation = occupation;
    }

    /**
     * If there is an abstract method in a class, that class must be abstract.
     * The abstract method introduce in type Human can only be defined by anabstract
     * classJava(67109227)
     */
    public abstract void introduce();

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", gender=" + gender + ", occupation=" + occupation + "]";
    }

    /**
     * It can have concrate(Implemented) methods as well
     * 
     * @param name
     */
    void setName(String name) {
        this.name = name;
    }

    static String getName(String name) {
        return name;
    }

    void sayHello() {
        System.out.println("Hello Guys!");
    }

    final void saySomething() {
        System.out.println(saySomething);
    }

    /**
     * The abstract class can also be used to provide some implementation of the
     * interface. In such case, the end user may not be forced to override all the
     * methods of the interface.
     * But Overriding methods should be public (public void sleep)
     */
    public void sleep() {
        System.out.println("I'm sleeping!");
    }

}
