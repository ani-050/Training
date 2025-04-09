package queue;

public class QULLDriver {
	
	public static void main(String[] args) {
		QueueUsingLL queue=new QueueUsingLL();
		queue.insert(10);
		queue.display();
		queue.insert(20);
		queue.display();
		queue.insert(30);
		queue.display();
		System.out.println(queue.delete());
		queue.display();
	}

}
