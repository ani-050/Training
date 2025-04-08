package searching;

public class Linear2d {
	
	public static int[] search2d(int arr[][]) {
		int i,j = 0;
		int search=7;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				if(search==arr[i][j]) {
					return res;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{7,4,9},{34,54,78}};
		int[] res=search2d(arr);
		System.out.println(search2d(arr));
	}

}
