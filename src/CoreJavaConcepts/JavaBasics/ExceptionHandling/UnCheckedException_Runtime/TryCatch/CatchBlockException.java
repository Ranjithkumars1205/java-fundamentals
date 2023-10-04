package CoreJavaConcepts.JavaBasics.ExceptionHandling.UnCheckedException_Runtime.TryCatch;

public class CatchBlockException {
    public static void main(String[] args) {

        try {
            int data1 = 50 / 0; // may throw exception

        }
        // handling the exception
        catch (Exception e) {
            // generating the exception in catch block
            int data2 = 50 / 0; // may throw exception
            // enclose exception code within a try block and use catch block only to handle
            // the exceptions.
        }
        System.out.println("rest of the code");
    }
}
