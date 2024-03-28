package StreamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "apple",
                "orange", "banana", "pear",
                "apple", "banana");

        Map<String, Long> wordFrequency = words.stream()
                .collect(Collectors.groupingBy
                        (word -> word, Collectors.counting()));

        System.out.println("Word frequency: " + wordFrequency);
    }
}

