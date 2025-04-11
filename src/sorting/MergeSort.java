package sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int arr[],int start,int mid,int end) {
		int leftArrayLength=mid-start+1;
		int rightArrayLength=end-mid;
		
		int[] leftArray=new int[leftArrayLength];
		int[] rightArray=new int[rightArrayLength];
		
		for(int i=0;i<leftArrayLength;i++) {
			leftArray[i]=arr[start+i];
		}
		
		for(int i=0;i<rightArrayLength;i++) {
			rightArray[i]=arr[mid+i+1];
		}
		
		int i=0,j=0,k=start;
		
		while(i<leftArrayLength && j<rightArrayLength) {
			if(leftArray[i]<rightArray[j]) {
				arr[k++]=leftArray[i++];
			}
			else {
				arr[k++]=rightArray[j++];
			}
		}
		while(i<leftArrayLength) {
			arr[k++]=leftArray[i++];
		}
		while(j<rightArrayLength) {
			arr[k++]=rightArray[j++];
		}
	}
	
	public static void mergeSort(int arr[],int start,int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {0,6,3,1,7};
		int start=0;
		int end=arr.length;
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}