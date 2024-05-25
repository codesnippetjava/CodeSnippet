package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
