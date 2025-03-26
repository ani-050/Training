package inheritance;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Person(){}
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
	void displayParentDetails() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

}
