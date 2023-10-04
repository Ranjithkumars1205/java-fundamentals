package CoreJavaConcepts.JavaBasics.ExceptionHandling.ThrowException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedThrowException {

    public static void fileUpdate() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException();
    }

    public static void main(String[] args) {

        try {
            fileUpdate();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("rest of the code...");

    }

}
