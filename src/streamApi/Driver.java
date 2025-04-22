package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
//		empList.forEach(System.out::println);
		
//		Map<String, List<Employee>> map=empList.stream().collect(Collectors.groupingBy(Employee::getCity));
//		for(String city:map.keySet()) {
//			System.out.println(city+"\n"+map.get(city));
//		}
		
//		Map<Integer, List<Employee>> map2=empList.stream().collect(Collectors.groupingBy(Employee::getAge));
//		for(int age:map2.keySet()) {
//			System.out.println(age+"\n"+map2.get(age));
//		}
		
//		List<String> list=empList.stream().map(Employee::getDeptName).distinct().toList();
//		System.out.println(list);
		
//		List<Employee> list2=empList.stream().filter(i->i.getAge()>28).toList();
//		System.out.println(list2);
		
//		Employee maxAge=empList.stream().max((e1,e2)->e1.getAge()-e2.getAge()).get();
//		System.out.println(maxAge);
		
//		Employee youngFemale=empList.stream().filter(i->i.getGender()=="F").min((e1,e2)->e1.getAge()-e2.getAge()).get();
//		System.out.println(youngFemale);
		
	}
	

}
