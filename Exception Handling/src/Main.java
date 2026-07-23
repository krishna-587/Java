public class Main {
    public static void main(String[] args)  {
        int neu []= {20, 45, 2, 10};
        int deno[] = {10, 5, 0, 5};
        int i=0;
        do {
            System.out.println(divide(neu[i], deno[i]));
            i++;
        }while(i<neu.length);

    }

    public static int divide(int a, int b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}