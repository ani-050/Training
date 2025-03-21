package array;

public class SumColRow {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8}};
		for(int i=0;i<arr.length;i++) {
			int rowSum=0;
			for(int j=0;j<arr[0].length;j++) {
				rowSum+=arr[i][j];
			}
			System.out.println(rowSum);
		}
		for(int i=0;i<arr.length;i++) {
			int colSum=0;
			for(int j=0;j<arr[0].length;j++) {
				colSum+=arr[j][i];
			}
			System.out.println(colSum);
		}
		
	}

}
