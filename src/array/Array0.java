package array;

import java.util.Arrays;

public class Array0 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		task(arr);
		for(int[] temp:arr) {
			System.out.println(Arrays.toString(temp));
		}
	}

	static void task(int[][] arr) {
		int[][] newArr=new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				newArr[i][j]=arr[i][j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==0) {
					for(int k=0;k<arr[0].length;k++) {
						newArr[i][k]=0;
					}
					for(int k=0;k<arr.length;k++) {
						newArr[k][j]=0;
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=newArr[i][j];
			}
		}
	}

}
