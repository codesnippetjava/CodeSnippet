package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Using anonymous inner class
        numbers.removeIf(integer -> integer % 2 == 0);

        // Print the filtered list
        StringBuffer sb = new StringBuffer("Code");
        sb.append("Snippet");
        sb.insert(4, " ");

        System.out.println(sb);
    }
}
class Parent {
    public void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Child class");
    }
}

