package generics;

import java.util.LinkedList;

public class WidCards {
	
	public static <T> void printLinkedList(LinkedList<?> list) {
		for(Object i:list) {
			System.out.println(i);
		}
		Object i=list.get(0);
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		printLinkedList(list);
	}

}
