package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(n -> n%2 ==0)
                .forEach(System.out::println);

    }
}

