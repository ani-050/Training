package methods;

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num:");
		int num = sc.nextInt();
		int odd=0;
		int even=0;
		int n;
		while(num>0) {
			n=num%10;
			if(n%2==0)
				even++;
			else
				odd++;
			num=num/10;
		}
		int sum=odd*even;
		System.out.println("Product:"+sum);
		sc.close();
	}

}
