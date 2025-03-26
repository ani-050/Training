package encapsulation;

public class HouseComposition {
	
	private String color;
	private Room room;
	
	public HouseComposition(String color,double area) {
		this.color=color;
		room=new Room(area);
	}

	public String getColor() {
		return color;
	}

	public Room getRoom() {
		return room;
	}
		

}
