package parallelAndSequentialStreams;


import java.util.Arrays;


public class ParallelAndSequentialStreams {
    public static void main(String[] args) {
        int[] intArray = new int[1000000];
        Arrays.fill(intArray, 2);

        // Calculate sum of squares using sequential stream
        long startTime = System.currentTimeMillis();
        final int sequentialSum = Arrays.stream(intArray)
                .map(n -> n * n)
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential sum: "
                + sequentialSum);
        System.out.println("Time Taken by Sequential Stream: "
                + (endTime - startTime) + " ms");

        // Calculate sum of squares using parallel stream
        startTime = System.currentTimeMillis();
        final int parallelSum = Arrays.stream(intArray)
                .parallel()
                .map(n -> n * n)
                .sum();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel sum: " + parallelSum);
        System.out.println("Time Taken by Parallel Stream: "
                + (endTime - startTime) + " ms");
    }
}

