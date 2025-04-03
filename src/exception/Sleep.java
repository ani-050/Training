package exception;

public class Sleep {
	
	public static void print() throws InterruptedException{
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args) throws InterruptedException{
		print();
	}

}
