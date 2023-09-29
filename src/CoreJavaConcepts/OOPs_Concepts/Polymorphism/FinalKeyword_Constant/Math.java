package CoreJavaConcepts.OOPs_Concepts.Polymorphism.FinalKeyword_Constant;

// If you make any class as final, you cannot extend it.
public final class Math {

    private Math() {
    }

    public static final double PI = 3.14159265358979323846;

    public static int add(int a, int b) {
        return a + b;
    }
}
