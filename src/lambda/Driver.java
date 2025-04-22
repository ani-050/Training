package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Operation o=Calci::add;
		int res=o.operate(10,20);
		System.out.println(res);
		
		List<Integer> list=Arrays.asList(1,2,5,4,3);
		list.forEach(System.out::println);
		
		Collections.sort(list,Integer::compareTo);
		list.forEach(System.out::println);
		
		Integer[] arr=list.toArray(Integer[]::new);
	}

}
