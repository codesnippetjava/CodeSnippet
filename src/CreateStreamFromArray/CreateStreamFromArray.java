package CreateStreamFromArray;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamFromArray {
    public static void main(String[] args) {
        //Primitive Array
        int[] intArray = {1,2,3,4};
        //Object Arrays
        Integer[] integerArray = {1,2,3,4};

        final IntStream stream = Arrays.stream(intArray);
        stream.forEach(System.out::println);

        final Stream<Integer> integerArrayObject = Stream.of(integerArray);

        integerArrayObject.forEach(System.out::println);

    }
}
