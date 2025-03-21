package methods;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		System.out.println("enter a string");
		String s = sc.next();
		System.out.println(num+"\t"+s);
		sc.close();
	}

}
