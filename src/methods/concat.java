package methods;

public class concat {
	public static void display(char a) {
		int c=a;
		System.out.println("a"+" "+c);
	}
	
	public static void fullName(String firstName,String lastName) {
		System.out.println(firstName+" "+lastName);
	}
	
	public static void main(String[] args) {
		display('a');
		fullName("aniket","marik");
		int res=returnAscii('a');
		System.out.println(res);
	}
	
	public static int returnAscii(char c) {
		return c;
	}

}
