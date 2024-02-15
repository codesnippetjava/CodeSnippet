package HashmapDemo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sachin",30);
        //index = hashCode(key) & (n-1).

       /* {
            int hash = 115
            Key key = {"sachin"}
            Integer value = 30
            Node next = null
        }*/

        map.put("Vishal",20);
        map.put("Vaibhav",20);

        System.out.println(map);
    }
}
