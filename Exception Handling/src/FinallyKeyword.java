import java.io.BufferedReader;

public class FinallyKeyword {
    public static void main(String[] args) {
        readFile();
        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return -1;
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader("a.txt"));
            String line = reader.readLine();
        } catch (Exception e) {
            System.out.println("Error: File not found");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}