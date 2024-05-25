package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        final Optional<Integer> min =
                numbers.stream().max(Comparator.naturalOrder());

        System.out.println(min.get());
    }
}
