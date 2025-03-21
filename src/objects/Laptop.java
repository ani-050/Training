package objects;

public class Laptop {
	
	int price;
	String brand;
	int ram;
	Laptop(int price,String brand,int ram){
		System.out.println("Default constructor");
		this.price=price;
		this.brand=brand;
		this.ram=ram;
	}

}
