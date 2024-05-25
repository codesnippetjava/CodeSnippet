package VisibilityProblem;

import VisibilityProblem.SharedFlag;

public class Volatile{

    public static void main(String[] args) {
        SharedFlag flag = new SharedFlag();
        //Thread 1
        new Thread(() -> {
            try {
                System.out.println("Thread 1 started");
                Thread.sleep(1000);
                flag.setFlag(true);
                System.out.println("Flag set to True by thread 1 ");
                System.out.println("Thread 1 Completed");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();

        //Thread 2
        new Thread(() -> {
            System.out.println("Thread 2 started");
            while(!flag.isFlag()) {
                //some processing
            }
            System.out.println("Thread 2 Completed");
        }).start();
    }
}
