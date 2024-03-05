package ZeroOneSum;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ZeroOne {
    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(0,1,1,0,0,1,0,0,1,1,1);
        final Integer sum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);




    }
}
