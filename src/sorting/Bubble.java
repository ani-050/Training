package sorting;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int[] arr= {2,5,3,1,4,0};
		boolean swapped;
		for(int i=0;i<arr.length-1;i++) {
			swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					swapped=true;
				}
			}
			if(!swapped)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}

}
