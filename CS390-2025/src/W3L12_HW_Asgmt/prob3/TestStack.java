package W3L12_HW_Asgmt.prob3;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        System.out.println("Push 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop, peek: " + stack.peek());
        System.out.println("Stack: " + stack);

        try {
            System.out.println("Pushing 40 to trigger overflow...");
            stack.push(40);
        } catch (IllegalStateException e) {
            System.out.println("Overflow: " + e.getMessage());
        }
        try {
            stack.push(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Popping all elements...");
            stack.pop(); stack.pop(); stack.pop();
            System.out.println("Now popping once more to trigger underflow...");
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Underflow (pop): cannot pop from empty stack.");
        }

        try {
            System.out.println("Peeking empty stack...");
            stack.peek();
        } catch (EmptyStackException e) {
            System.out.println("Underflow (peek): cannot peek on empty stack");
        }
    }
}
