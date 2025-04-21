package deliverySystem;

import java.util.Arrays;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		Restaurent res=new Restaurent("Good Food");
		res.addMenuItem("berger",100);
		res.addMenuItem("pizza",200);
		res.addMenuItem("pasta",150);
		
		Customer c=new Customer("ani");
		c.login();
		
		Order order=new Order();
		
		List<String> items=Arrays.asList("berger","pizza","pasta");
		
		try {
			order.order(c,res,items);
		}
		catch(OrderLimitExceedException | MenuItemNotFoundException e) {
			System.out.println("Error"+e.getMessage());
		}
	}

}
