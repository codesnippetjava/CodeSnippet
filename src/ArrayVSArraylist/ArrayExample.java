package ArrayVSArraylist;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Access elements in the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Size of the array is fixed
        System.out.println("Array size: " + numbers.length);
    }
}

