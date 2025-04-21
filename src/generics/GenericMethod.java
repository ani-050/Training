package generics;

public class GenericMethod {
	
	public static <T> void printArray(T[] arr) {
		for(T i:arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Double[] arr= {1.2,2.3,3.4,4.5};
		printArray(arr);
	}

}
