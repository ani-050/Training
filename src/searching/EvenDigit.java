package searching;

public class EvenDigit {
	
	public static void main(String[] args) {
		int[] arr= {12,345,2,6,7896,34};
		System.out.println(count(arr));
	}
	
	public static int count(int arr[]) {
		int even=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			while(arr[i]>0) {
				arr[i]/=10;
				count++;
			}
			if(count%2==0)
				even++;
		}
		return even;
	}

}
