package MapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {

        //MAP EXAMPLE
        List<String> list = Arrays.asList("apple", "mango","orange");
        final List<String> upperCaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("MAP OUTPUT: "+upperCaseList);
        //MAP OUTPUT: [APPLE, MANGO, ORANGE]

        //FLATMAP EXAMPLE
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple","mango"),
                Arrays.asList("orange","pineapple"),
                Arrays.asList("grapes","kiwi")
        );
        System.out.println("NESTED LIST OUTPUT: "+nestedList);
       // NESTED LIST OUTPUT: [[apple, mango], [orange, pineapple], [grapes, kiwi]]

        final List<String> flattenedUpperCaseList = nestedList.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("FLATMAP OUTPUT: "+flattenedUpperCaseList);
       // FLATMAP OUTPUT: [APPLE, MANGO, ORANGE, PINEAPPLE, GRAPES, KIWI]
    }
}
