package lambda;

public class Uber {
	
	public static void main(String[] args) {
		Vehicle car=(a,b)-> a+b;
		int res=car.start(10,20);
		System.out.println(res);
	}

}
