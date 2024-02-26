package Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //1
        Vector<Integer> v =
                new Vector<Integer>();
        //2
        Vector<Integer> vSize =
                new Vector<Integer>(15);
        //3
        Vector<Integer> vInc =
                new Vector<Integer>(15,
                        5);
        //4
        Collection<Integer> collection = new ArrayList<>();
        Vector<Integer> vCollection =
                new Vector<Integer>(collection);

        v.add(1);
        v.add(2);
        System.out.println(v);
        v.remove(1);
        System.out.println(v);


        //Synchronization
        //Dynamic Size

        //Disadvantage
        //Performance
    }
}
