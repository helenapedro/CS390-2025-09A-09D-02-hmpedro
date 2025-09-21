package dshandson.stacks;

import dshandson.arraylist.StringArrayList;

public class StringStack { // Stack (LIFO)
    private final StringArrayList stack;

    public StringStack() {
        stack = new StringArrayList();
    }

    public void push(String target) {
        stack.add(target);
    }

    public String pop() {
        return stack.removeLast();
    }

    public String peek() {
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int size() {
        return stack.size();
    }

    public String toString() {
        if (stack.isEmpty()) return "[]";
        return stack.toString();
    }

    public static void main(String[] args) {
        StringStack st = new StringStack();
        st.push("a");
        st.push("b");
        st.push("c");
        System.out.println("Size -> " + st.size());
        System.out.println(st);

        System.out.println("Peek -> " + st.peek());
        System.out.println("Pop -> " + st.pop());
        System.out.println("Stack -> " + st);
        System.out.println("isEmpty -> " + st.isEmpty());
        System.out.println("isFull -> " + st.isFull());
    }
}
