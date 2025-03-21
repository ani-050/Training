package methods;

import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value:");
		int i = sc.nextInt();
		System.out.println("Enter the last value:");
		int n = sc.nextInt();
		int s=0;
		if(n>i) {
		for(int a=i;a<=n;a++) {
			s=s+a;	
		}
		//System.out.println(s);
		}
		else {
			for(int a=n;a>=i;a--) {
				s=s+a;	
			}
		}
		System.out.println(s);
		sc.close();
	}

}
