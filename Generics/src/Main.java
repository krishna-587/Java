import java.util.ArrayList;

public class Main {
    // why need of Generics
    public static void main(String[] args) {
        int arr[] = new int[5];
        // list is of type Object, can store any type of object(value)
        ArrayList list = new ArrayList();

        list.add("Krishna");  // String
        list.add(10);  // Integer
        list.add(10.5);  // Double

        // as I've not defined the type of value a list can store, so it is storing all types of values
        // Every class in java extends Object class, so list is storing all types of values as Object type
        // If I want to get the value from the list, I need to typecast it to the original type of value, otherwise it will give an exception (ClassCastException)
        String name = (String) list.get(0);
        int number = (Integer) list.get(1);

        // So now if I want to store any specific type of value in the list then I can define its type so that it can make arraylist of that type only

        // This is because of Generics, Generics is a feature of Java that allows us to define the type of value a collection can store.
        // It is a way to provide type safety to our code.

        ArrayList<String> list1= new ArrayList<String>();
        list1.add("Krishna");
        list1.add("Hello");

        String str1 = list1.get(1); // will return string value, no need of typecasting

    }


}