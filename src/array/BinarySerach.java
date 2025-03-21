package array;

import java.util.Arrays;

public class BinarySerach {
	public static void main(String[] args) {
		int[] arr = {2,4,5,3,8,9,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int target = 5;
		int start = 0;
		int end = arr.length-1;
		int mid;
		while(start<=end) {
			mid = start+(end-start)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target==arr[mid]) {
				System.out.println(mid);
				break;
			}
			else
				System.out.println(-1);
			break;
		}
	}

}
