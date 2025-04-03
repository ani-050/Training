package abstraction;

public interface Vehicle {
	
	abstract void start();
	abstract void stop();
	abstract void accelarate(int increment);
	abstract void brake(int decrement);
	abstract int getCurrentspeed();
	default void dispalyType() {
		System.out.println("type vehicle");
	}

}
