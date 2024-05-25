package parallelAndSequentialStreams;

import java.util.Arrays;

import java.util.stream.LongStream;

public class FactorialParallelAndSequentialStreams {
    public static void main(String[] args) {
        long[] longArray = new long[20000];
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = i + 1;
        }

        // Calculate sum of factorials using sequential stream
        long startTime = System.currentTimeMillis();
        long sequentialSum = Arrays.stream(longArray)
                .map(FactorialParallelAndSequentialStreams::factorial)
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential sum of factorials: " +
                "" + sequentialSum);
        System.out.println("Time Taken by Sequential Stream: "
                + (endTime - startTime) + " ms");


        // Calculate sum of factorials using parallel stream
        startTime = System.currentTimeMillis();
        long parallelSum = Arrays.stream(longArray)
                .parallel()
                .map(FactorialParallelAndSequentialStreams::factorial)
                .sum();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel sum of factorials: "
                + parallelSum);
        System.out.println("Time Taken by Parallel Stream: "
                + (endTime - startTime) + " ms");
    }

    // Method to calculate factorial of a number
    public static long factorial(long number) {
        return LongStream.rangeClosed(1, number)
                .reduce(1, (long a, long b) -> a * b);
    }
}
