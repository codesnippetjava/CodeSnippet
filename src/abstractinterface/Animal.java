package abstractinterface;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();

    void sleep() {
        System.out.println
                (name + " is sleeping.");
    }
}
