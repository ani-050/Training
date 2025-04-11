package hashMap;

import java.util.LinkedList;

public class LLDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			int temp=list.get(i);
			System.out.println(temp);
		}
	}

}
