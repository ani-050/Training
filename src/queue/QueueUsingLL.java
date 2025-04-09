package queue;

import linkedList.SLL;

public class QueueUsingLL {
	
	private SLL list;
	
	public QueueUsingLL() {
		list = new SLL();
	}
	
	public boolean insert(int value) {
		return list.append(value);
	}
	public int delete() {
		int data = list.get(0);
		list.deleteFirst();
		return data;
	}
	
	public void display() {
		list.display();
	}

}
