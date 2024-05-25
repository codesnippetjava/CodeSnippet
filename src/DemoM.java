public class DemoM extends Thread{


    public static void main(String[] args) {
        Thread t = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t.start();
    }

}
