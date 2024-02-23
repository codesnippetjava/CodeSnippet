package Collections.List;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
    public static void main(String[] args) {
        //3 ways to initialize arraylist
        //1
        ArrayList<Integer> arr =
                new ArrayList();
        //2
        Collection<Integer> collection = new ArrayList<>();

        ArrayList<Integer> arrWithCollection
                = new ArrayList(collection);
        //3
        ArrayList<Integer> arrWithSize =
                new ArrayList(15);

        arr.add(1);
        arr.add(2);
        arr.forEach(System.out::println);

        //Details:

        //ArrayList is Underlined
        // data Structure Resizable Array .

        //ArrayList Duplicates Are Allowed.
        // Insertion Order is Preserved.
        // Heterogeneous objects are allowed.
        // Null insertion is possible.
    }
}
