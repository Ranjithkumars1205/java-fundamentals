package CoreJavaConcepts.JavaBasics.ExceptionHandling.UnCheckedException_Runtime.TryCatch;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            // Code that may throw an exception
            arr[5] = 4;
            System.out.println("rest of the try block code");
            // If an exception occurs at the particular statement in the try block, the rest
            // of the block code will not execute. So, it is recommended not to keep the
            // code in try block that will not throw an exception.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds: " + e.getMessage());
            // Handle the exception
        } finally {
            // Code that will always execute
            // The "finally" block is used to execute the necessary code of the program. It
            // is executed whether an exception is handled or not.
            // throw new CustomException("This is a custom exception message");
            System.out.println("rest of the code");
        }
        System.out.println("rest of the code");

    }

}
