package FunctionalInterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;

        System.out.println(addition.operate(2,3));
        System.out.println(subtraction.operate(3,2));
    }
}
