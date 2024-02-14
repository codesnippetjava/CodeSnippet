package StringBufferVsStringBuilder;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer();
        //Thread 1
         Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                string.append("A");
            }
        });
        //Thread 2
        Thread thread2 = new Thread(() -> {
            for (int i =0;i<1000;i++){
                string.append("B");
            }
        });
        //Start Threads
        thread1.start();
        thread2.start();
        //Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Result : "
                + string.toString().length());
    }
}
