package abstraction;

public class Truck extends AbstractVehicle {
	
	@Override
	public void start() {
		System.out.println("truck is starting......");
	}
	
	@Override
	public void stop() {
		System.out.println("truck is stopping......");
	}
	
	Truck(String name,int speed){
		super(name,speed);
	}
	
}
