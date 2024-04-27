package DefaultDemo;

import java.util.function.Predicate;

interface Vehicle {
    void start();
    default void honk() {
        System.out.println("Beep beep!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

}

class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck started");
    }

}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
       car.honk();


        Truck truck = new Truck();
        truck.start();

        Predicate<String> startsWithA = str -> str.startsWith("A");
        Predicate<String> endsWithB = str -> str.endsWith("B");
        String text = "Apple";
        boolean result = startsWithA.and(endsWithB).test(text);
        System.out.println("Result: " + result);
    }
}
