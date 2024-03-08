package Collections.List;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =
                new PriorityQueue<>();
        pq.add(6);
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(8);
        pq.add(9);
        pq.add(2);


        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
    }
}
