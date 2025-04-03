package exception;

import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args) {
		double money=100000,wMoney;
		int pin=1234,uPin;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pin:");
		uPin=sc.nextInt();
		if(pin==uPin) {
			System.out.println("Enter amount:");
			wMoney=sc.nextDouble();
			if(0<wMoney && wMoney<money) {	
				withdraw(wMoney,money,pin);
			}
			else {
				throw new Wrong("invalid amount");
			}
		}
		else {
			throw new Wrong("invalid pin");
		}
	}
	
	public static void withdraw(double wMoney, double money,int pin) {
		money=money-wMoney;
		System.out.println(money);
	}
	
}
