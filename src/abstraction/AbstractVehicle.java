package abstraction;

public abstract class AbstractVehicle implements Vehicle {
	
	protected String name;
	protected int speed;
	AbstractVehicle(String name,int speed){}
	void diplayDetails() {
	System.out.println("vehicle name:"+name);	
	System.out.println("vehicle speed:"+speed);	
	}
	@Override
	public void accelarate(int increment) {
		this.speed+=increment;
		
	}
	@Override
	public void brake(int decrement) {
		this.speed-=decrement;
		
	}
	@Override
	public int getCurrentspeed() {
		return speed;
		
	}
}
