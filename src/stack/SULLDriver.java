package stack;

public class SULLDriver {
	
	public static void main(String[] args) {
		SULL stack=new SULL();
		stack.push(10);
		stack.display();
		stack.push(20);
		stack.display();
		stack.push(30);
		stack.display();
		stack.push(40);
		stack.display();
		stack.pop();
		stack.display();
		System.out.println(stack.peek());
	}

}
