package Stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        // Create a list of ages
        List<Integer> ages =
                Arrays.asList(15, 20, 25, 30, 16, 18, 22);

        final List<Integer> adults = ages.stream()
                .filter(n -> n >= 18)
                .toList();
        System.out.println(adults);
    }
}
