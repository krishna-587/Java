import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class tryWithResources {
    public static void main(String[] args) {
        // object created in try block will be closed automatically after the execution of try block
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\krishnag\\Desktop\\Learnings\\Exception Handling\\src\\a.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: File not found");
    }
        finally {
            System.out.println("Finally block executed");
        }
}
}
