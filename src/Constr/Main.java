package Constr;

class Parent {
    Parent() {
        System.out.println
                ("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        //super(); // Explicit call to the superclass constructor
        System.out.println
                ("Child constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

