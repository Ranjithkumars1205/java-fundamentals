package Abstraction.Interface;

/**
 * All data members within the interface should be initialized
 * it can have static and final varible
 * Interfaces cannot have constructors
 * Multiple inheritance is supported with abstract method.. not default method
 * it can't have public method with body
 */

interface Human {
    String name = ""; // it can have data members

    static final String saySomething = "Have a blessed Day!";
    /**
     * By default, it is public, static and final, don't need to add it explicitly,
     * check takeAway file
     * Private not permitted
     */
    static int year = 1996; // it can have static variables

    /**
     * If there is an abstract method in a class, that class must be abstract.
     * The abstract method introduce in type Human can only be defined by anabstract
     * classJava(67109227)
     */
    public void introduce();

    void doDaily();

    static String getName(String name) {
        return name;
    }

    default void sayHello() {
        System.out.println("Hello Guys!");
    }

    /**
     * Illegal modifier for the interface method saySomething; only public, private,
     * abstract, default, static and strictfp are permittedJava(67109935)
     */
    // final void saySomething() {
    // System.out.println(saySomething);
    // }

    default void saySomething() {
        System.out.println(saySomething);
        quotes();
    }

    static void sleep() {
        System.out.println("Get 8 hours of sleep daily!");
    }

    // Starting from Java 9, You can define private methods within an interface to
    // encapsulate common
    // functionality used by default methods
    private void quotes() {
        System.out.println("Be good, do good");
    }

}
