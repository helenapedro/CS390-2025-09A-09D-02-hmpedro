package lesson12.inclassexercise;

public class NodeStack {
	private Node top;	
	public void push(String s) {
		Node newTop = new Node();
		newTop.data = s;
		newTop.next = top;
		top = newTop;
	}
	public String peek() throws StackException {
		if(top != null) {
			return top.data;
		}
		else {
			throw new StackException("Stack is empty!");
		}
	}
	public String pop() throws StackException {
		if(top != null) {
			String s = peek();
			top = top.next;
			return s;
		
		} else {
			throw new StackException("Stack is empty!");
		}
	}
	
	public void printStack() {
		if(top == null) System.out.println("Empty stack");
		else System.out.println(top);
	}

	public static void main(String[] args) {
		NodeStack stack = new NodeStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		try {
			System.out.println(stack.peek());
			stack.printStack();
			System.out.println(stack.pop());
			stack.printStack();	
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch(StackException e) {
			System.out.println("Caught StackException " + e.getMessage());
		}
	}
}
