package methods;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int n=0,s=0,nm;
		nm = num;
		while(num>0) {
			n++;
			num=num/10;
		}
		num=nm;
		while(num>0) {
			s+=Math.pow(num%10,n);
			num/=10;
		}
		if(nm==s)
			System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");
		sc.close();
	}

}
