package FunctionInterfaceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Define a function that converts a string to its length
        Function<String, Integer> stringLengthFunction
                = String::length;

        // Apply the function to a string
        String input = "Code Snippet";
        int length = stringLengthFunction.apply(input);

        // Print the result
        System.out.println
                ("Length of '" + input + "': " + length);

        List<String> words =
                Arrays.asList("apple", "banana", "cherry");

        String result = words.stream()
                .filter(s -> s.contains("e"))
                .map(String::toUpperCase)
                .findFirst()
                .orElse("No match");

        System.out.println(result);


            int x = 5;
            System.out.println(x++ * ++x);

    }
}
