package array;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		int[] arr = {1,5,7,3,4,8,2};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 4));
		arr = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 5)));
		;
	}

}
