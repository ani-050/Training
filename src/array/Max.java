package array;

import java.util.Arrays;

public class Max {
	public static void main(String[] args) {
		int[][] arr= {
				{3,1,2},
				{4,9,5},
				{8,1,3}
		};
		int i,j = 0;
		int max = arr[0][0];
		int index0=0, index1=0;
		for (i = 0; i < arr.length-1; i++) {
			for (j = 0; j < 2; j++) {
				if(max<arr[i][j]) {					
					max=arr[i][j];
					index0 = i;
					index1 = j;
				}
			}
		}
		for (int[] sub: arr) {
			System.out.println(Arrays.toString(sub));
		}
		System.out.println(max);
		System.out.println(index0+" "+index1);

	}
}
