package CoreJavaConcepts.JavaBasics.ExceptionHandling.ThrowException;

class UserDefinedException extends Exception {
    public UserDefinedException(String str) {
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("This is user-defined exception");
        } catch (Exception ude) {
            System.out.println("Caught the Exception");
            // Print the message from MyException object
            System.out.println(ude.getMessage());
        }
    }
}
