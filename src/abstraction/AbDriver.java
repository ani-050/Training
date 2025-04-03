package abstraction;

public class AbDriver {
	public static void main(String[] args) {
		Calculate c=new AddSub();
		System.out.println(c.add(5, 10));
		System.out.println(c.sub(5, 10));
	}

}
