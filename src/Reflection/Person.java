package Reflection;

public class Person {
	
	private String name;
	private int age;
	
	private Person() {
		System.out.println("no args cons");
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getDetails() {
		return name+"\t"+age;
	}
	
	private void task(String task) {
		System.out.println("doing task:"+task);
	}
}
