package inheritance;

public class VehicleDriver {
	
	public static void main(String[] args) {
		Bike b=new Bike(true,"fgjfg454","honda","sfg",10,true);
		Car c=new Car(2,"fgjfg454","honda","sfg",10,true);
		b.displayDetails();
		System.out.println("\n");
		c.displayDetails();
	}

}
