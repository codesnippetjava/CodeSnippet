package SUMOFDIGITS;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigitsUsingStream(number);
        System.out.println
                ("Sum of digits of " + number + " is: " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            // Add the last digit to the sum
            sum += number % 10;
            // Remove the last digit from the number
            number /= 10;
        }
        return sum;
    }


    public static int sumOfDigitsUsingStream(int number) {
        return String.valueOf(number)
                .chars()                                // Convert the number to a stream of characters
                .map(Character::getNumericValue)       // Map each character to its integer value
                .sum();                                 // Calculate the sum of the integers
    }
}

