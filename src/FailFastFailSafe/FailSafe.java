package FailFastFailSafe;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

    public static void main(String[] args) {
        //FailFastFailSafe.FailSafe - CopyOnWriteArrayList , ConcurrentHashMap
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        list.forEach(item-> {
            System.out.println(item);
            list.add(400);
        });
        list.forEach(item-> {
            System.out.println(item);
        });
    }
}
