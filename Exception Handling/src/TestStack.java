public class TestStack {
    public static void main(String[] args) {

        // If run without try-catch, the program will terminate and print the exception stack trace
        // or, can print the exception stack trace using e.getStackTrace()
        // If run with try-catch, the program will catch the exception and print the exception message

        try{
            level1();
        }catch (Exception e){
            System.out.println(e.getStackTrace());  // return array of stack trace elements ( StackTraceElement[] )
            //or
            e.printStackTrace(); // print the stack trace to the console
            System.out.println(e);
        }

//        level1();
    }

    public static void level3(){
        int [] array = new int[5];
        array[5] = 10; // This will throw ArrayIndexOutOfBoundsException
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
