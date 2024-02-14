package MethodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference{

    public static void main(String[] args) {
        List<Integer> integers =
                Arrays.asList(4,9,16,25,64);

        final List<Double> sqRootList = integers.stream()
                .map( Math::sqrt)
                .collect(Collectors.toList());
        System.out.println(sqRootList);
    }
}
