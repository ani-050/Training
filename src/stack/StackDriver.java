package stack;

public class StackDriver {
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.display();
		stack.pop();
		stack.display();
		System.out.println(stack.peek());
	}

}
