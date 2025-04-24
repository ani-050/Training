package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\User\\Desktop\\FileHandling\\Demo\\b.txt");
		BufferedWriter b=new BufferedWriter(f);
		b.write("hi");
		b.write("\n");
		b.write('a');
		b.newLine();
		b.write(34);
		b.flush();
		System.out.println("data written");
	}

}
