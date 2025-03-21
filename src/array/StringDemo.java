package array;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[10];
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.next();
		}
		
		for (String string : s) {
			System.out.println(string);
		}
	}

}
