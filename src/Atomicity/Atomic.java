package Atomicity;

public class Atomic {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();
        //Thread 1
        new Thread(() -> {
            System.out.println("Thread 1 started");
            for (int i = 0; i < 50000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread 1 Completed");
        }).start();

        //Thread 2
        new Thread(() -> {
            System.out.println("Thread 2 started");
            for (int i = 0; i < 50000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread 2 Completed");
        }).start();

        //wait for both threads to complete
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Count : " + sharedCounter.getCount());
    }
}
