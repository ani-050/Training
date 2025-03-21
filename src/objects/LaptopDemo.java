package objects;

public class LaptopDemo {
	
	public static void main(String[] args) {
		
		Laptop l=new Laptop(20000,"dell",6);
		Laptop l1=new Laptop(23456,"hp",8);
		System.out.println(l==l1);
		
		System.out.println(l.brand);
		System.out.println(l1.brand);
		System.out.println(l.price);
		System.out.println(l1.price);
		System.out.println(l.ram);
		System.out.println(l1.ram);
	}

}
