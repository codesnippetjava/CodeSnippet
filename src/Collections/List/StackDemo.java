package Collections.List;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Creating an empty Stack
        Stack<String> stack = new Stack<String>();

        // Use push() to add elements into the Stack
        stack.push("Follow");
        stack.push("code");
        stack.push("Snippet");
        stack.push("Now");

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + stack.peek());

        stack.pop();
        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);
    }
}
