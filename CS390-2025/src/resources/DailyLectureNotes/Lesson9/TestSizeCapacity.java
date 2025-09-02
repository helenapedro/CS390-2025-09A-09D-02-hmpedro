package lesson9.stack;

import java.util.Stack;
import java.util.Vector;

public class TestSizeCapacity {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.size()); // Stack is empty
        System.out.println(stack.capacity()); // Default capacity is 10
        stack.push(10);
        stack.push(10); // All List DS accepts duplicates
        stack.push(null); // No error
        System.out.println("Size Stack = " + stack.size());
        System.out.println(stack);
        System.out.println("Peek = " + stack.peek());
        Vector<String > vect = new Vector<>(50);
        System.out.println("Vector size = " + vect.size() +
                "\nVector Capacity = " + vect.capacity());

    }
}
