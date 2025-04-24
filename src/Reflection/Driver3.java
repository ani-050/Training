package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Driver3 {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<Person> c=Person.class;
		
		//get all variables
		Field[] all_var=c.getDeclaredFields();
		for(Field var:all_var) {
			System.out.println(var);
		}
		System.out.println("---------------");
		
		//get specified variables
		Field f=c.getDeclaredField("age");
		System.out.println(f);
	}

}
