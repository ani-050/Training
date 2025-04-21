package generics;

public class ShapeDriver {
	
	public static void main(String[] args) {
		Shape<Integer,String> s1=new Shape<>(5,"circle");
		int key=s1.getKey();
		String value=s1.getValue();
		System.out.println(key);
		System.out.println(value);
	}

}
