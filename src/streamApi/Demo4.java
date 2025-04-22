package streamApi;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("apple","banana","cow","dog");
		List<String> list2=list.stream().map(s->s.toUpperCase()).toList();
		System.out.println(list2);
		String res=list.stream().filter(i->i.charAt(0)=='a').findFirst().get();
		System.out.println(res);
	}

}
