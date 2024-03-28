package ThreadPoolExecutorExample;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExecutorExample {

    public static void main(String[] args) {
parallel();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1,
                10,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(2));

        // Submit tasks to the ThreadPoolExecutor
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                try {
                    Thread.sleep(1000); // Simulate task execution time
                    System.out.println
                            ("Task " + taskId + " completed by "
                                    + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shut down the ThreadPoolExecutor
        executor.shutdown();
    }
    private static void parallel(){
        List<Integer> intList =Arrays.asList(1,2,3,4);
        long t1 = System.currentTimeMillis();
        intList.stream().parallel().forEach(n->{
            try {
                Thread.sleep(2000);
                System.out.println(n);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        long t2 = System.currentTimeMillis();
        System.out.println("t2-t1"+(t2-t1));
    }
}
