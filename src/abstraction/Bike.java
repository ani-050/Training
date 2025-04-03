package abstraction;

public class Bike extends AbstractVehicle {
	
	@Override
	public void start() {
		System.out.println("Bike is starting......");
	}
	
	@Override
	public void stop() {
		System.out.println("Bike is stopping......");
	}
	
	Bike(String name,int speed){
		super(name,speed);
	}
	

}
