package searching;

public class Linear {
	
	public static int linear(int arr[]) {
		int search=4;
		int i;
		for(i=0;i<arr.length;i++) {
			if(search==arr[i])
				return i;
		}
		return i;
	}
	
	public static void main(String[] args) {
		int[] arr= {12,3,4,76};
		System.out.println(linear(arr));
	}

}
