package CoreJavaConcepts.OOPs_Concepts.StaticConcepts.StaticBlock;

/**
 * they are executed only once when the class is loaded. It's good practice to
 * use static blocks for complex initializations that cannot be
 * handled directly during variable declaration.
 * 
 * It is executed before the main method at the time of classloading.
 */

public class App {
    private static int staticVariable = 0;
    // pls check counter.java as well
    static {
        staticVariable = 2;
        System.out.println("static block is invoked");
    }

    public static void main(String[] args) {
        System.out.println(staticVariable);
    }
}
