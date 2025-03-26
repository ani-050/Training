package inheritance;

public class Child extends Parent {
	
	static {
		System.out.println("child loaded");
	}
	
	static void child() {
		System.out.println("child method");
	}

}
