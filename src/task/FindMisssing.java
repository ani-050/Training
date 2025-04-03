package task;

public class FindMisssing {
	public static int find(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int total=(arr.length*(arr.length+1))/2;
		return total-sum;
	}
	
	public static void main(String[] args) {
		int[] arr= {9,6,4,2,3,5,7,0,1};
		System.out.println(find(arr));
	}

}
