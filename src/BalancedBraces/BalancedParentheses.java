package BalancedBraces;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Invalid closing bracket or empty stack
            }
        }
        return stack.isEmpty(); // Stack should be empty if all brackets are balanced
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println("Is '" + s + "' valid? " + isValid(s)); // Output: true
    }
}
