package Shortcuts;

public class IntelliJVariableExtraction {
    public static void main(String[] args) {
        final String name = "John";
        final int age = 10;
        String greeting = "Hello, " + name + "! You are " + age + " years old.";
        System.out.println(greeting);
    }
}
