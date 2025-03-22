package encapsulation;

import java.util.Scanner;

public class atm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=sc.next();
		System.out.print("Enter your Account Number:");
		long accNumber=sc.nextLong();
		System.out.print("Enter your initial balance:");
		double initialBalance=sc.nextDouble();
		while(1>0) {
			System.out.println("------"+"Welcome "+name+"------"+"\n"+"Press 1 for Withdraw money."
					+"\n"+"Press 2 for deposit money."
					+ ""+"\n"+"Press 3 for check balance."
					+"\n"+"Press 4 for Exit.");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the amount to be withdrawn:");
				double withdrawAmount=sc.nextDouble();
				break;
				
			case 2:
				System.out.println("Enter the amount to be deposited:");
				double deposit=sc.nextDouble();
				break;
				
			case 3:
				System.out.println("Account Balance:");
				break;
				
			case 4:
				System.out.println("Thankyou.");
				System.exit(0);
				break;
					
			default :
				System.out.println("Wrong Choice.");
			}
		}
	}

}
