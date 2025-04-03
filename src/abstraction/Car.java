package abstraction;

public class Car extends AbstractVehicle {
	
	@Override
	public void start() {
		System.out.println("car is starting......");
	}
	
	@Override
	public void stop() {
		System.out.println("car is stopping......");
	}
	
	Car(String name,int speed){
		super(name,speed);
	}

}
