

public class AbstractInterface {
}

//defining a skill or behaviour

interface programmable {
    void programming();
}
interface Drivable {
    void start();
    void stop();
    void honk();
}

//group of related classes
//inheritance //hierarchy
 abstract class Vehicle {
    protected int fuelLevel;
    protected int speed;

    public Vehicle(int fuelLevel) {
        this.fuelLevel = fuelLevel;
        this.speed = 0;
    }

    public void refuel(int amount) {
        this.fuelLevel += amount;
    }

    public void accelerate(int increment) {
        this.speed += increment;
    }

    public void brake(int decrement) {
        this.speed -= decrement;
    }

    public abstract void drive();
}


