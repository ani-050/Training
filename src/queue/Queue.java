package queue;

import java.util.Arrays;

public class Queue {
	int[] data;
	int pointer=-1;
	int initial_capacity=10;
	
	Queue(){
		data=new int[initial_capacity];
	}
	
	Queue(int size) {
		data=new int[size];
	}
	
	private boolean isEmpty() {
		return pointer==-1;
	}
	
	private boolean isFull() {
		return pointer==data.length-1;
	}
	
	public boolean insert(int value) {
		if(isFull()) {
			data=Arrays.copyOf(data, data.length*2);
		}
		pointer++;
		data[pointer]=value;
		return true;
	}
	
	public boolean delete() {
		if(isEmpty()) {
			return false;
		}
		for(int i=0;i<pointer;i++) {
			data[i]=data[i+1];
		}
		pointer--;
		display();
		return true;
	}
	
	public int peek() {
		return data[pointer];
	}
	
	public int getSize() {
		return pointer+1;
	}
	
	public void display() {
		for(int i=0;i<=pointer;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}

}
