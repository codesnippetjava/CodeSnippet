package Streams;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        final long count = numbers.stream()
                .count();

        System.out.println(count);
    }
}
