package parallelAndSequentialStreams;

import java.util.Arrays;

public class ParallelAndSequentialStreams {
    public static void main(String[] args) {
        int[] intArray = new int[1000000];
        Arrays.fill(intArray,2);

        long startTime = System.currentTimeMillis();
        //Calculate sum of squares using sequential streamin
        final int sum = Arrays.stream(intArray)
                .parallel()
                .map(n -> n * n)
                .sum();
        long endTime = System.currentTimeMillis();

        //Calculate sum of squares using parallelStream
        System.out.println(sum);
        System.out.println("Time Taken :" + (endTime-startTime));
    }
}
