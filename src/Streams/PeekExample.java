package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        final List<Integer> sqaredList = numbers.stream()
                .map(n -> n * n)
                .peek(System.out::println)
                .collect(Collectors.toList());


    }
}

