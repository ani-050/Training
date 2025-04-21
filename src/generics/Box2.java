package generics;

public class Box2<T> {
	T num1;
	T num2;
	
	Box2(T num1, T num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public static void main(String[] args) {
		Box2<Integer> b1=new Box2<>(10,20);
		System.out.println(b1.num1 + b1.num2);
	}

}
