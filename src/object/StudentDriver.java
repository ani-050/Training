package object;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student e=new Student(12345,"aniket",98);
		Student e2=new Student(12345,"aniket",98);
		System.out.println(e);
		System.out.println(e2);
		System.out.println(e.equals(e2));
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e.hashCode()==e2.hashCode());
	}

}
