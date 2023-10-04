package CoreJavaConcepts.JavaBasics.ExceptionHandling.UnCheckedException_Runtime.TryCatch;

public class ShouldHandleException {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code"); // it won't execute as we didn't handle the exception correctly!
        // If you don't have idea about what exception might occur, then use normal
        // exception (Exception e).
    }
}
