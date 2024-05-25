package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        final Optional<Integer> first = numbers.stream()
                .filter(number -> number % 2 == 0)
                .findFirst();

        System.out.println(first.get());

    }
}

