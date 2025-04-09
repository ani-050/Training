package stack;

import java.util.EmptyStackException;

import linkedList.SLL;

public class SULL {
	private SLL list;
	private int pointer = -1;

	public SULL() {
		list = new SLL();
	}

	private boolean isEmpty() {
		return pointer == -1;
	}

	public boolean push(int value) {
		pointer++;
		return list.prepend(value);
	}

	public int pop() {
		if (isEmpty())
			throw new EmptyStackException();
		int data = list.get(0);
		pointer--;
		list.deleteFirst();
		return data;
	}

	public int peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return list.get(0);
	}

	public void display() {
		list.display();
	}

}
