package deliverySystem;

public class Customer {
	
	public String name;
	boolean isLoggedIn;
	
	public Customer(String name){
		this.name=name;
	}
	public void login() {
		isLoggedIn=true;
	}
	public void logout() {
		isLoggedIn=false;
	}

}
