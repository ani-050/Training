package map;

public class Book {
	
	private String title;
	private double price;
	
	Book(String title, double price){
		this.title=title;
		this.price=price;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double price() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return this.title;
	}
	
	@Override
	public int equals() {
		
	}

}
