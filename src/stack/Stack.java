package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	private int[] data;
	private int pointer = -1;
	final private int initial_capacity=10;
	
	private boolean isFull() {
		return pointer==data.length-1;
	}
	
	private boolean isEmpty() {
		return pointer==-1;
	}
	
	Stack(){
		data=new int[initial_capacity];
	}
	
	public boolean push(int value) {
		if(isFull()) {
			data=Arrays.copyOf(data, data.length*2);
		}
		data[++pointer]=value;
		return true;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int temp=data[pointer];
		pointer--;
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return data[pointer];
	}
	
	public void display() {
		for(int i=0;i<=pointer;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}

}
