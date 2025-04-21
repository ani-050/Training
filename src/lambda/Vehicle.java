package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Vehicle {

	public static void main(String[] args) {
//		List<Integer> arr=List.of(1,2,3,4,5);

		List<Integer> arr=Arrays.asList(1,2,3,4,5);
		
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		arr.add(30);
//		arr.add(40);
//		arr.add(50);
		
//		System.out.println(arr);
		
		arr.forEach(t-> System.out.println(t) );
	}

}
