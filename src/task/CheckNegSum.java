package task;

public class CheckNegSum {
	
	public static void main(String[] args) {
		int[] arr= {-1,2,-3,4,-5};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				 sum=sum+arr[j];
	             if(sum<0)
	            	count++;
			}
		}
		System.out.println(count);
	}
}

