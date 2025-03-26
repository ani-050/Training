package inheritance;

public class Child1 extends Parent1 {
	
	String name="name2";
	
	void display() {
		String name="name3";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
	}

}
