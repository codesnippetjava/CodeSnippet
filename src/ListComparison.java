import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Add elements to both lists
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Measure access time\]
        long startTime = System.nanoTime();
        arrayList.get(5000);
        long endTime = System.nanoTime();
        System.out.println(
                "ArrayList access time: " +
                        (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.get(5000);
        endTime = System.nanoTime();
        System.out.println(
                "LinkedList access time: " +
                        (endTime - startTime) + " ns");

        // Measure insertion time
        startTime = System.nanoTime();
        arrayList.add(5000, 99999);
        endTime = System.nanoTime();
        System.out.println(
                "ArrayList insertion time: "
                        + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.add(5000, 99999);
        endTime = System.nanoTime();
        System.out.println(
                "LinkedList insertion time: "
                        + (endTime - startTime) + " ns");

        // Measure deletion time
        startTime = System.nanoTime();
        arrayList.remove(5000);
        endTime = System.nanoTime();
        System.out.println("" +
                "ArrayList deletion time: "
                + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.remove(5000);
        endTime = System.nanoTime();
        System.out.println(
                "LinkedList deletion time: "
                        + (endTime - startTime) + " ns");
    }
}

