package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Driver1 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//3 ways to get Class object
		Class<Person> c1=Person.class;
//		Class<Person> c2=(Class<Person>) new Person("ani",20).getClass();
//		Class<Person> c3=(Class<Person>) Class.forName("Reflection.Person");
		
		System.out.println(c1.getPackageName());
		System.out.println("--------------");
		
		//getting specified constructor
		Constructor<Person> p=c1.getConstructor(String.class,int.class);
		System.out.println(p);
		System.out.println("--------------");
		Constructor<Person> p2=c1.getDeclaredConstructor();
		System.out.println(p2);
		System.out.println("--------------");
		Constructor<Person> p3=c1.getDeclaredConstructor(String.class,int.class);
		System.out.println(p3);
		System.out.println("--------------");
		
		//getting all constructor
		Constructor<?>[] all=c1.getDeclaredConstructors();
		for(Constructor<?> constructor:all) {
			System.out.println(constructor);
		}
		System.out.println("--------------");
		
		Constructor<Person> cons=c1.getDeclaredConstructor();
		cons.setAccessible(true);
		Person p4=cons.newInstance();
		System.out.println(p4.getDetails());
		System.out.println("--------------");
		
		Constructor<Person> cons1=c1.getDeclaredConstructor(String.class,int.class);
		Person p5=cons1.newInstance("aniket",20);
		System.out.println(p5.getDetails());
		System.out.println("--------------");
	}

}
