package exception;

public class ArrOut {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		String str=null;
		try {
			try {
				System.out.println(str.length());
			}
			catch(NullPointerException n) {
				n.printStackTrace();
				System.out.println(n.getMessage());
			}
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
