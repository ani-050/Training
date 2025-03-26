package inheritance;

public class Car extends Vehicle {
	
	private int noOfDoors;

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	Car(){}
	
	Car(int noOfDoors, String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable){
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.noOfDoors=noOfDoors;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("door:"+this.noOfDoors);
	}

}
