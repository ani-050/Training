package exception;

import java.util.Scanner;

public class Demo {
	public static String reInt(int age) {
		if(age>=21) {
			return "go marry";
		}
		else {
			throw new InvalidAge("wait");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		System.out.println(reInt(age));
	}

}
