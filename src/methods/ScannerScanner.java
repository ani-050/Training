package methods;

import java.util.Scanner;

public class ScannerScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		Scanner sc = new Scanner(s);
		sc.useDelimiter(",");
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			System.out.println(n);
		}
		sc.close();
		scanner.close();
	}

}
