package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Employees {

	static ArrayList<Employee> list_of_emp=new ArrayList<>();

	public static void addEmployee(Employee emp) {
		list_of_emp.add(emp);
		System.out.println("employee added successfully\n-------------------------------");
	}

	public static void print() {
				for(Employee emp:list_of_emp) {
					System.out.println(emp);
				}
		// using iterator
		//		Iterator<Employee> itr=list_of_emp.iterator();
		//		while(itr.hasNext()) {
		//			Employee emp=itr.next();
		//			System.out.println(emp);
		// using list iterator
//		ListIterator<Employee> list_itr=list_of_emp.listIterator(list_of_emp.size());
//		while(list_itr.hasPrevious()) {
//			Employee emp=list_itr.previous();
//			System.out.println(emp);
//		}
	}

	public static boolean searchObject(Employee emp) {
		if(list_of_emp.contains(emp));
		return true;
	}

	public static boolean searchById(int id) {
		for(Employee emp:list_of_emp) {
			if(emp.getId()==id)
				return true;
		}
		return false;		
	}
	
	public static void removeObject(Employee emp) {
		list_of_emp.remove(emp);
		System.out.println("employee successfully deleted.\n------------------------");
	}
	
	public static void removeById(int id) {
		Employee e=null;
		for(Employee emp:list_of_emp) {
			if(emp.getId()==id)
				e=emp;
		}
		list_of_emp.remove(e);
		System.out.println("id successfully deleted\n--------------------");
	}
	
	public static void updateById(int id, Scanner sc) {
		Employee old=null;
		for(Employee emp:list_of_emp) {
			if(emp.getId()==id)
				old=emp;
		}
		System.out.println("enter name, salary to update:");
		old.setName(sc.next());
		old.setSalary(sc.nextDouble());
		System.out.println("id successfully updated\n--------------------");
	}

	public static void sort() {
		Collections.sort(list_of_emp);
		System.out.println("employees are sorted\n---------------------");
	}

}
