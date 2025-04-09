package queue;

public class QueueDriver {
	
	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.insert(10);
		queue.display();
		queue.insert(20);
		queue.display();
		queue.insert(30);
		queue.display();
		queue.delete();
		System.out.println(queue.peek());
		System.out.println(queue.getSize());
	}

}
