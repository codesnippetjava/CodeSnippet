package Streams;

import java.util.Arrays;
import java.util.List;

public class SumExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        final int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum );
    }
}
