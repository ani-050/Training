package encapsulation;

public class HouseCompositionDriver {
	
	public static void main(String[] args) {

		HouseComposition house = new HouseComposition("blue", 600);
		System.out.println(house.getColor());
		System.out.println(house.getRoom().getArea());
		house=null;
		System.out.println(house.getRoom().getArea());

	}
}
