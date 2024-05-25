package HashMapVsConCurrentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        ExecutorService executorService
                = Executors.newFixedThreadPool(10);

        // Task to put values in the map
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Value" + i);
            }
        };

        // Submit multiple tasks to the executor service
        for (int i = 0; i < 10; i++) {
            executorService.submit(task);
        }

        // Shutdown the executor service
        executorService.shutdown();

        // Wait for all tasks to finish
        while (!executorService.isTerminated()) {
        }

        // Print the size of the map
        System.out.println("HashMap Size: " + map.size());
    }
}

