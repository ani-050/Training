package deliverySystem;

import java.util.HashMap;
import java.util.Map;

public class Restaurent {
	
	public String resName;
	Map<String,MenuItem> menu=new HashMap<>();
	
	public Restaurent(String resName) {
		this.resName=resName;
	}
	
	public void addMenuItem(String name, double price) {
		menu.put(name,new MenuItem(name,price));
	}
	
	public MenuItem getMenuItem(String name) throws MenuItemNotFoundException{
		if(!menu.containsKey(name)) {
			throw new MenuItemNotFoundException("Item not found:"+ name);
		}
		return menu.get(name);
	}

}
