package BoundedTypeDemo;

import java.util.Arrays;
import java.util.List;

public class BoundedTypeDemo {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,4,5);
        findMax(integerList);

        List<Double> doubleList = Arrays.asList(1.0,2.1,8.1);
        findMax(doubleList);
    }

    private static <T extends Number & Comparable<T>> void findMax(List<T> list) {
        if(list==null || list.isEmpty()) {
            throw new IllegalArgumentException("Empty list");
        }
        T max = list.get(0);
        for (int i =0 ; i< list.size();i++){
            T curr = list.get(i);
            if(curr.compareTo(max) == 1){
                max = curr;
            }
        }
        System.out.println("Maximum Element is : "+ max);
    }
}
