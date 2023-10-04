package CoreJavaConcepts.JavaBasics.ExceptionHandling.UnCheckedException_Runtime.MultipleCatchBlock;

public class App {
    public static void main(String[] args) {
        /**
         * In this example, try block contains two exceptions. But at a time only one
         * exception occurs and its corresponding catch block is executed.
         */
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

}
