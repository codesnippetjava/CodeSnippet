package Code;

import java.util.Arrays;
import java.util.List;

public class CleanCode {
    public static void main(String[] args) {
        List<Integer> list
                = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        final List<Integer> output = list.stream()
                .filter(CleanCode::checkValidation)
                .toList();
        System.out.println(output);

    }

    private static boolean checkValidation(Integer x) {
        boolean isEven = x % 2 == 0;
        boolean isGreaterThanFive = x > 5;
        boolean isDivisibleByThree = x % 3 == 0;
        return isEven &&
                isGreaterThanFive &&
                isDivisibleByThree;
    }
}
