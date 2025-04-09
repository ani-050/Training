package stack;

import java.util.EmptyStackException;

import linkedList.SLL;

public class StackUsingLL {
	private SLL list;
	private int pointer=-1;
	
	public StackUsingLL() {
		list=new SLL();
	}
	
	private boolean isEmpty() {
		return pointer==-1;
	}
	
	public boolean push(int value) {
		pointer++;
		return list.append(value);
	}
	
	public int pop() {
		if(isEmpty())
			throw new EmptyStackException();
		int data=list.get(pointer);
		pointer--;
		list.deleteLast();
		return data;
	}
	
	public int peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return list.get(pointer);
	}
	
	public void display() {
		list.display();
	}

}
