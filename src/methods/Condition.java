package methods;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of money Chinchan have:");
		int money = sc.nextInt();
		if(money>=40)
			System.out.println("Hey Chinchan, you can have a vanilla icecream.");
		else
			System.out.println("Hey Chinchan, you can't have any icecream.");
		sc.close();

	}

}
