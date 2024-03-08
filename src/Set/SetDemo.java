package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(10);
        hashSet.add(4);
        hashSet.add(20);
        hashSet.add(50);
        System.out.println("HashSet :"+hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        System.out.println("LinkedHashSet :"+linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(5);
        System.out.println("TreeSet :"+treeSet);

    }

}
