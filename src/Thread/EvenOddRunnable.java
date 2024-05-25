package Thread;

public class EvenOddRunnable implements Runnable{
    int MAX;
    static int  counter = 1;
    int rem;
    static Object lock = new Object();
    // parameterized constructor
    EvenOddRunnable(int rem, int MAX)
    {
        this.rem = rem;
        this.MAX = MAX;
    }
    // override run() method
    @Override
    public void run() {
        // use while loop to recursively execute steps until counter < MAX
        while (counter < MAX) {
            // synchronized block
            synchronized (lock) {
                while (counter % 2 != rem) { // wait for numbers other than remainder
                    // use try-catch block to put lock in waiting state
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                //increment counter
                counter++;
                lock.notifyAll();
            }
        }
    }
}