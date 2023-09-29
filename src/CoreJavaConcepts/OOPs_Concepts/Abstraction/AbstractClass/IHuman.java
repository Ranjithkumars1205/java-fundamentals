package CoreJavaConcepts.OOPs_Concepts.Abstraction.AbstractClass;

/**
 * You cannot use the abstract and public keyword when defining methods within
 * an interface
 * For Example: public abstract void speak();
 * If you want to define a contract without providing any implementation, you
 * should use interfaces in Java instead of abstract class.
 * It can't be instantiated
 */

public interface IHuman {

    // void speak();

    void doDaily();

    void sleep();

    // void play();
}
