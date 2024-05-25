import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Demo {
    public static void main(String[] args) {

        //JAVA 17
        ArrayList<Integer> list =
                new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println
                (list.get(0));
        System.out.println
                (list.get(list.size()-1));

        LinkedHashSet set = new LinkedHashSet();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println( set.iterator().next());

        LinkedHashMap map = new LinkedHashMap();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);

        map.get(1);

        int x = 5;
        x *= (3 + 7);
        System.out.println(x);
        //System.out.println(x);

    }
}
