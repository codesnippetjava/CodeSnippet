package Atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter {
    //Code without Atomic
    /*    private int count=0;
    public void increment(){
        count++;
    }
    public int getCount() {
        return count;
    }*/
    private AtomicInteger count= new AtomicInteger(0);
    public void increment(){
        count.incrementAndGet();
    }
    public int getCount() {
        return count.get();
    }
}
