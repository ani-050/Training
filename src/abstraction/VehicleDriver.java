package abstraction;

import java.util.Scanner;

public class VehicleDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AbstractVehicle vehicle=null;
		System.out.println("enter name:");
		String name=sc.next();
		System.out.println("enter speed:");
		int speed=sc.nextInt();
		System.out.println("Enter your choice:\n1.car\n2.bike\n3.truck");
		switch(sc.nextInt()) {
		case 1:{
			vehicle=new Car(name,speed);
			break;
		}
		case 2:{
			vehicle=new Bike(name,speed);
			break;
		}
		case 3:{
			vehicle=new Truck(name,speed);
		}
		default:
			System.out.println("invalid input");
		}
		if(vehicle instanceof Car) {
			vehicle=(Car)vehicle;
		}
		else if(vehicle instanceof Bike) {
			vehicle=(Bike)vehicle;
		}
		else if(vehicle instanceof Truck) {
			vehicle=(Truck)vehicle;
		}
		System.out.println();
		vehicle.start();
		System.out.println("current speed:"+vehicle.getCurrentspeed());
		vehicle.accelarate(20);
		System.out.println("after accelerating current speed:"+vehicle.getCurrentspeed());
		vehicle.brake(30);
		System.out.println("after braking current speed:"+vehicle.getCurrentspeed());
		vehicle.stop();
		vehicle.dispalyType();
		vehicle.diplayDetails();
		sc.close();
	}

}
