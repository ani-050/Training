package inheritance;

public class Vehicle {
	
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}
	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}
	public boolean getisAvailable() {
		return isAvailable;
	}
	public void setisAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	Vehicle(){}
	
	Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable){
		this.brand=brand;
		this.isAvailable=isAvailable;
		this.model=model;
		this.vehicleNumber=vehicleNumber;
		this.rentalPricePerDay=rentalPricePerDay;
	}
	void displayDetails() {
		System.out.println("brand:"+this.brand);
		System.out.println("model:"+this.model);
		System.out.println("vehicle number:"+this.vehicleNumber);
		System.out.println("rental price:"+this.rentalPricePerDay);
		System.out.println("is available:"+this.isAvailable);
	}
	
	void rentVehicle() {
		
	}

}
