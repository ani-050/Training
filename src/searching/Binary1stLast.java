package searching;

public class Binary1stLast {
	
	public static void main(String[] args) {
		int[] arr= {5,7,7,8,8,10};
		int target=8;
		int[] res=search(arr,target);
	}
	
	public static int[] search(int arr[],int target) {
		int start=0;
		int end=arr.length-1;
		int i=0;
		int mid;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} 
			else if (target < arr[mid]) {
				end = mid - 1;
			} 
			else if (target == arr[mid]) {
				
				if (target > arr[mid]) {
					start = mid + 1;
					} 
				else if (target < arr[mid]) {
					end = mid - 1;
					}
			}
		}
		return arr;
	}

}
