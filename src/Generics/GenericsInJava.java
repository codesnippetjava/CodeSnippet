package Generics;


public class GenericsInJava {
    public static void main(String[] args) {
        Generic<Integer> genericInteger = new Generic();
        genericInteger.setItem(1);

         int item = genericInteger.getItem();
        System.out.println(item);
    }
}
