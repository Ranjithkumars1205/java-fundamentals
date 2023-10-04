package CoreJavaConcepts.JavaBasics.ExceptionHandling.UnCheckedException_Runtime.FinallyBlock_AlwaysExecute;

public class ExceptionNotHandled {
    public static void main(String[] args) {
        /**
         * Let's see the the fillowing example. Here, the code throws an exception
         * however the catch block cannot handle it. Despite this,
         * the finally block is executed after the try block and then the program
         * terminates abnormally.
         */
        try {
            int data = 21 / 0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        // executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }

}
