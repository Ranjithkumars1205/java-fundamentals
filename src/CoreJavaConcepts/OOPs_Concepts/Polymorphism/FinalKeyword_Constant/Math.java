package CoreJavaConcepts.OOPs_Concepts.Polymorphism.FinalKeyword_Constant;

// If you make any class as final, you cannot extend it.
// But we can create instance
public final class Math {

    private Math() { // if it's not private class, we can create instance for this final class as
                     // well
    }

    public static final double PI = 3.14159265358979323846;

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Math m = new Math();
    }
}
