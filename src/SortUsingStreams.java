import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(5, 3, 9, 1, 6, 2);

        List<Integer> sortedNumbersDesc =
                numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Sorted numbers in descending order: " +
                "" + sortedNumbersDesc);

        List<String> words =
                Arrays.asList("apple", "banana", "kiwi", "cherry");

        List<String> sortedWordsByLength = words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

        System.out.println("Sorted words by length: "
                + sortedWordsByLength);
    }
}
