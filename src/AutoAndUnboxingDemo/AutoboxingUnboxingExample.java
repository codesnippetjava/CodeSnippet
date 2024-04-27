package AutoAndUnboxingDemo;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> integerList = new ArrayList<>();

        // Autoboxing: Converting primitive int to Integer object
        int num1 = 10;
        Integer numObject1 = num1; // Autoboxing

        // Add the Integer object to the list
        integerList.add(numObject1);

        // Unboxing: Converting Integer object to primitive int
        Integer numObject2 = integerList.get(0);
        int num2 = numObject2; // Unboxing

        // Print the values
        System.out.println
                ("Autoboxing: Primitive int to Integer object: " + numObject1);
        System.out.println
                ("Unboxing: Integer object to primitive int: " + num2);
    }
}

