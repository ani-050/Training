package FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo4 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter p=new PrintWriter("C:\\Users\\User\\Desktop\\FileHandling\\Demo\\b.txt");
		p.println(true);
		p.println(10);
		p.println("hi");
		p.println('a');
		p.flush();
		System.out.println("data done");
	}

}
