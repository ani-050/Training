package inheritance;

public class Bike extends Vehicle {
	 private boolean hasGear;

	public boolean getHasGear() {
		return hasGear;
	}

	public void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}
	 
	Bike(){}
	
	Bike(boolean hasGear, String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable){
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.hasGear=hasGear;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("gear:"+this.hasGear);
	}

}
