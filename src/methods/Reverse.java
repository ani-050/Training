package methods;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the num:");
		int num = sc.nextInt();
		int n=0,i;
		i=num;
		while(num>0) {
			n = n*10+(num%10);
			num = num/10;
		}
		if(i==n)
			System.out.println("Palindrme");
		else
			System.out.println("Not palindrome");
		sc.close();
	}

}
