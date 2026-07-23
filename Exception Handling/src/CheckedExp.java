import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExp {
    public static void main(String[] args) {
        // Checked Exception: FileNotFoundException, will occur at compile time
        // we can handle this exception using try-catch block or by throwing the exception using throws keyword
        try {
            FileReader file = new FileReader("C:\\Users\\krishnag\\Desktop\\Learnings\\Exception Handling\\src\\a.txt");
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (Exception e) {
            System.out.println("Error: File not found");
        }
    }

    // using throws keyword to throw the exception to the caller method
    public static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("a.txt");
    }
}
