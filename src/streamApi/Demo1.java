package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,4,5);
//		List<Integer> list2=new ArrayList<Integer>();
//		for(Integer a:list) {
//			if(a%2==0)
//				list2.add(a);
//		}
//		System.out.println(list2);
		
		List<Integer> list2=list.stream().filter(i->i%2==0).toList();
		System.out.println(list2);
		List<Integer> list3=list.stream().limit(4).skip(2).toList();
		System.out.println(list3);
		List<Integer> list4=list.stream().sorted().toList();
		System.out.println(list4);
		List<Integer> list5=list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list5);
		List<Integer> list6=list.stream().sorted(Comparator.reverseOrder()).distinct().toList();
		System.out.println(list6);
		List<Integer> list7=list.stream().map(n->n*2).toList();
		System.out.println(list7);
		int res=list.stream().min(Integer::compare).get();
		System.out.println(res);
		int res2=list.stream().max(Integer::compare).get();
		System.out.println(res2);
		
		List<String> word=Arrays.asList("apple","banana","cow","dog");
		List<String> word2=word.stream().filter(s->s.charAt(0)=='a').toList();
		System.out.println(word2);
		List<String> word3=word.stream().filter(s->s.length()>3).toList();
		System.out.println(word3);
		
	}

}
