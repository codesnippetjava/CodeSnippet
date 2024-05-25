package Streams;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );
        listOfLists.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
