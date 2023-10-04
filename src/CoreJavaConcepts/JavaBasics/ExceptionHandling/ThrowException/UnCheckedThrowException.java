package CoreJavaConcepts.JavaBasics.ExceptionHandling.ThrowException;

public class UnCheckedThrowException {
    public static void validate(int age) {
        // Define a method that must throws an exception.
        // like throws ArithmeticException and must to handle the exception by using
        // catch block
        if (age < 18) {
            throw new ArithmeticException("Person is not eligible to vote!!");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void main(String[] args) {
        // try {
        // validate(15);
        // } catch (Exception e) {
        // // TODO: handle exception
        // }
        System.out.println("rest of the code..");
    }

}
