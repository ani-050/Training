package array;

public class revTrans {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2,3 }, { 4,5,6 }, { 7,8,9 } };
		int temp=0;
		//int[][] transArr = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				temp=arr[i][j];
				arr[i][j] = arr[j][i];
				System.out.print(arr[i][j]);

			}
			System.out.println();

		}
	}


}
