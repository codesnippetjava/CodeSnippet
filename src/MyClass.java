interface MyInterface {
    void method();
    // Default method
    default void defaultMethod() {
        System.out.println("Default method implementation");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method implementation");
    }
}

class MyClass implements MyInterface {
    // No need to override defaultMethod() as it has a default implementation


    @Override
    public void defaultMethod() {
        System.out.println("custom implementation");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Calling default method
        obj.defaultMethod(); // Output: Default method implementation

        // Calling static method
        MyInterface.staticMethod(); // Output: Static method implementation
    }

    @Override
    public void method() {

    }
}
