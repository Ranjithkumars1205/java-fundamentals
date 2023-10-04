package CoreJavaConcepts.JavaBasics.ExceptionHandling.UnCheckedException_Runtime.TryCatch;

public class NullPointerExample {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
    }
}
