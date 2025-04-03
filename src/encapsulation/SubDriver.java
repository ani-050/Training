package encapsulation;

import java.util.Scanner;

public class SubDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pupil c=new Pupil("gfd","fdh");
		System.out.println("Enter the name:");
		int numOfStudent;
		c.addSubject("c++",5);
		c.addSubject("java",4);
		c.addSubject("python",3);
		c.display();
	}

}
