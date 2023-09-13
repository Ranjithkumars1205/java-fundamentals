package Polymorphism.InstanceInitializerBlock;

/**
 * In Java, an instance initializer block is a block of code that is executed
 * when an instance of a class is created (i.e., when a constructor is called).
 * Instance initializer blocks are used to initialize instance variables or
 * perform some additional setup logic that should be executed for every
 * instance of the class.
 * Here are some scenarios in which you might want to use instance initializer
 * blocks:
 * Initialization of Instance Variables,
 * Common Initialization for All Constructors,
 * Complex Initialization Logic,
 * Initialization of Collections,
 * Initialization with Exception Handling,
 * 
 * Remember that instance initializer blocks are executed in the order they
 * appear in the class, after the parent class's constructor is called (if
 * applicable) and before the constructor of the current class is executed.
 * 
 */
public class App {

    public static void main(String[] args) {
        SubClass s1 = new SubClass();
        SubClass s2 = new SubClass("IIB");
    }

}
