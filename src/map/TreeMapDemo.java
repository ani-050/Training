package map;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> t=new TreeMap<>();
		t.put(3, "hello");
		t.put(2, "hey");
		t.put(1, "hi");
		System.out.println(t);
	}

}
