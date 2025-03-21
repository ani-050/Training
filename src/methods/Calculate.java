package methods;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2:");
		int num2 = sc.nextInt();
		System.out.println("Enter the operator:");
		char op = sc.next().charAt(0);
		if(op=='+') {
			System.out.println(num1+num2);
		}
		else if(op=='-')
			System.out.println(num2-num1);
		else if(op=='*')
			System.out.println(num1*num2);
		else if(op=='/')
			System.out.println(num1/num2);
		sc.close();
	}

}
