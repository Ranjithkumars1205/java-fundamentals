package CoreJavaConcepts.JavaBasics.ExceptionHandling.CheckedException_CompileTime.TryCatch;

import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptionExample {

    public static void main(String[] args) {
        try {
            // Code that may throw a checked exception
            FileInputStream file = new FileInputStream("file.txt");

        } catch (IOException e) {
            // Handle the exception
            System.err.println("An I/O error occurred: " + e.getMessage());
        }

    }

}
