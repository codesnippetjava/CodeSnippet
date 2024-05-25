package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStreams {
    public static void main(String[] args) {
        //Primitive Array
        int[] premitiveArray = {1,2,3,4};
        //Object Arrays
        Integer[] objectArray = {1,2,3,4};

        final IntStream intStream = Arrays.stream(premitiveArray);
        intStream.forEach(System.out::println);

        final Stream<Integer> integerStream = Stream.of(objectArray);
        integerStream.forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(1,2,3,4);
        integerList.stream()
                .forEach(System.out::println);

    }
}
