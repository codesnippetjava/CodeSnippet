package Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //2 constructors
        //1
        LinkedList<String> ll =
                new LinkedList<>();

        //2
        Collection<Integer> collection = new ArrayList<>();
        LinkedList llc =
                new LinkedList(collection);

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

        //Dynamic size
        //Efficient Insertions and Deletions
        //Flexible Iteration
        //not synchronized
        //duplicate elements
        //Maintain Insertion Order
    }
}
