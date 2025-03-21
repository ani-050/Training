package methods;

public class Calculator {
	public static void main(String[] args) {
		System.out.println(add(5,6));
		System.out.println(mul(5,6));
	}
	public static double add(double no1, double no2) {
		return no1+no2;
	}
	public static int mul(double no1, double no2) {
		return (int)(no1*no2);
	}
	

}
