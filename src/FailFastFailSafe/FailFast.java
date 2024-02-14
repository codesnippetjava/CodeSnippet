package FailFastFailSafe;

import java.util.ArrayList;

public class FailFast {
    public static void main(String[] args) {
        //FailFastFailSafe.FailFast - ArrayList ,HashMap
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        list.forEach(item-> {
            System.out.println(item);
            list.add(400);
        });

    }
}
