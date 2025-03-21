package methods;

public class MethodOverloading {
	public static void sub(int num1,int num2) {
		System.out.println(num1-num2);
	}
	public static void sub(int num1,int num2,int num3) {
		System.out.println(num1-num2-num3);
	}
	public static void sub(int num1,char num2) {
		System.out.println(num1-num2);
	}
	public static void mul(int num1,int num2) {
		System.out.println(num1*num2);
	}
	public static void mul(int num1,int num2,int num3) {
		System.out.println(num1*num2*num3);
	}
	public static void main(String[] args) {
		sub(7,4);
		sub(9,7,3);
		sub(6,'a');
		mul(7,3);
		mul(4,6,3);
	}

}
