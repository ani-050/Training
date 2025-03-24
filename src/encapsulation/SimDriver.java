package encapsulation;

public class SimDriver {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println(m);
		System.out.println(m.s);
		m.createSim();
		System.out.println(m.s);
	}

}
