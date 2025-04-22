package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo3 {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("apple","banana","kiwi","mango","lichi");
		Map<Integer, List<String>> map=list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		
		Map<Object, Long> map1=list.stream().collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting()));
		System.out.println(map1);
	}

}
