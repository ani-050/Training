package map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lh=new LinkedHashMap<>();
		lh.put(3,"hello");
		lh.put(2,"hi");
		lh.put(1,"hey");
		System.out.println(lh);
	}
	

}
