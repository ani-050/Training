package encapsulation;

public class CalDriver {
	public static void main(String[] args) {
		Calculator c=new Calculator(45.5,34.4);
			Calculator.add(c).mul(c);
			System.out.println(c.getResult());
			
	}

}
