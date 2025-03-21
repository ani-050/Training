package array;

public class Floor {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 9, 12, 17, 43, 87 };
		int target = 7;
		int start = 0;
		int end = arr.length - 1;
		int mid;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else if (target == arr[mid]) {
				break;
			}
		}
		System.out.println(end);

	}

}
