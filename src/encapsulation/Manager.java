package encapsulation;

public class Manager {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.getName();
		e.setName("aniket");
		System.out.println(e.getName());
	}

}
