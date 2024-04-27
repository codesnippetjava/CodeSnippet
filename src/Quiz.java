import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Quiz {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            numbers.remove(number);
        }
        System.out.println(numbers);
    }
    }

