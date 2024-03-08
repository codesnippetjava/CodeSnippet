package Collections.List;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q
                = new LinkedList<>();

        // Elements {10, 20, 30, 40, 50}
        // are added to the queue
        for (int i = 10; i <= 50; i += 10)
            q.add(i);

        // Printing the contents of queue.
        System.out.println(
                "The Elements of the queue are : "
                + q);

        // Removing queue's head.
        int x = q.remove();
        System.out.println("Removed element - "
                + x);

        System.out.println(q);

        // Viewing queue's head
        int head = q.peek();
        System.out.println("Head of the queue - "
                + head);

        int size = q.size();
        System.out.println("Size of the queue - "
                + size);

    }
}
