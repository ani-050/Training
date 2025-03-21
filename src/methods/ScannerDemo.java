package methods;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String word1 = sc.nextLine();
		char word = sc.next().charAt(0);
		System.out.println(num);
		System.out.println(word1);
		System.out.println(word);
		sc.close();
	}

}
