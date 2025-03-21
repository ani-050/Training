package array;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array:");
		int n = sc.nextInt();
		double[] a = new double [n];
		
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();
		}
		for(int i=n-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

}
