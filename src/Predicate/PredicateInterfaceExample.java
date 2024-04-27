package Predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample {
    public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserThan
                = i -> (i < 18);
        Predicate<Integer> greaterThanTen
                = (i) -> i > 10;
        // Calling Predicate method
        System.out.println
                (greaterThanTen.and(lesserThan).test(9));
    }
}
