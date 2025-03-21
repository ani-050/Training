package array;

public class SumEven {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Sum(arr));
	}
	public static int Sum(int[][] arr) {
		int sum=0;
		for(int[] sub: arr) {
			for(int i:sub) {
				if(i%2==0)
					sum+=i;
			}
		}
		return sum;
	}
}
