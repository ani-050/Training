package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\User\\Desktop\\FileHandling\\Demo\\c.txt");
		f.createNewFile();
		String[] list_of_file=f.list();
		System.out.println(Arrays.toString(list_of_file));
	}

}
