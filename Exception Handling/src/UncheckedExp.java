import java.io.FileNotFoundException;
import java.io.FileReader;

public class UncheckedExp {
    public static void main(String[] args) {
        // Unchecked Exception: NullPointerException , will occur at run time
        Student s = null;
        s.setName("Krishna"); // This will throw NullPointerException
    }


    // Using throw keyword to throw the exception explicitly
    public static void readFile2() {
        try {
           int a = 10 / 0; // This will throw ArithmeticException
        } catch (Exception e) {
            throw new ArithmeticException(e.getMessage()); // throwing the exception explicitly
        }
    }
}
