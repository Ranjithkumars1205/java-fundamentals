package CoreJavaConcepts.JavaBasics.ExceptionHandling.UnCheckedException_Runtime.FinallyBlock_AlwaysExecute;

public class ExceptionNotOccur {
    public static void main(String[] args) {
        try {
            int data = 20 / 5;
            System.out.println(data);
        } catch (NullPointerException e) {
            // TODO: handle exception

        } finally {
            // executes regardless of exception occured or not
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");

    }
}
