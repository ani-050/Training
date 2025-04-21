package deliverySystem;

import java.util.List;

public class Order {
	
	public void order(Customer customer,Restaurent restaurent,List<String>itemNames)throws OrderLimitExceedException, MenuItemNotFoundException{
		if(!customer.isLoggedIn) {
			System.out.println("Login required to place order.");
			return;
		}
		if(itemNames.size()>5) {
			throw new OrderLimitExceedException("can't order more than 5 items");
		}
		double total=0;
		System.out.println("order summary for "+customer.name+":");
		
		for(String itemName:itemNames) {
			MenuItem item=restaurent.getMenuItem(itemName);
			System.out.println("-"+item.name+":/-"+item.price);
			total+=item.price;
		}
		System.out.println("total:"+total);
		System.out.println("order placed successfully.");
	}

}
