package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        final List<Integer> evenSquredList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(evenSquredList);

    }
}
