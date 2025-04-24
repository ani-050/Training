package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("C:\\Users\\User\\Desktop\\FileHandling\\Demo\\b.txt");
		BufferedReader b=new BufferedReader(f);
		String i=b.readLine();
		while(i!=null) {
			System.out.println(i);
			i=b.readLine();
		}
	}

}
