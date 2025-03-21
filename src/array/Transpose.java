package array;

public class Transpose {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int[][] transArr = new int[3][2];
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				transArr[j][i] = arr[j][i];
				System.out.print(transArr[j][i]);

			}
			System.out.println();

		}
	}

}
