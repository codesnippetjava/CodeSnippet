package Collections.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(1,2,3,4,5);

        Iterator<Integer> iterator =
                list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
