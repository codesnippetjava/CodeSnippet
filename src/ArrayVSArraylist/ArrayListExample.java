package ArrayVSArraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declare and initialize an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Access elements in the ArrayList
        System.out.println("ArrayList elements:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Add a new element
        numbers.add(6);
        System.out.println("After adding an element: " + numbers);

        // Size of the ArrayList can grow dynamically
        System.out.println("ArrayList size: " + numbers.size());

        // Removing an element
        numbers.remove(0); // Removes the element at index 0
        System.out.println("After removing an element: " + numbers);
    }
}
