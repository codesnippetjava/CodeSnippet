package Collections.List;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<String> deque
                = new ArrayDeque<String>();

        deque.add("Follow");
        deque.add("Code");
        deque.add("Snippet");
        System.out.println(deque);

        deque.addFirst("Hello");
        deque.addLast("Now");
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);


        for (Iterator itr = deque.iterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        for (Iterator itr = deque.descendingIterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
    }
}
