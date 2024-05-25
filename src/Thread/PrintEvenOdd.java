package Thread;

public class PrintEvenOdd {
    public static void main(String[] args) {
        int MAX=10;

        // create instances of EvenOddRunnable classes
        EvenOddRunnable runnable1 = new EvenOddRunnable(1, MAX );
        EvenOddRunnable runnable2 = new EvenOddRunnable(0, MAX);
        // create thread1 and thread2
        Thread thread1 = new Thread(runnable1,"Odd");
        Thread thread2 = new Thread(runnable2,"Even");
// use start() method to start thread1 and thread2
        thread1.start();
        thread2.start();
    }
}
