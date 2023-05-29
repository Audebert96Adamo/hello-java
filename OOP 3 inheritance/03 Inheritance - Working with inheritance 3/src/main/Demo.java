package main;

import main.vehicles.Bike;


public class Demo {

	public static void main(String[] args) {
		Bike bike = new Bike("long", "Diesel", 4, 4, 40, "LED");
		System.out.println("Handle : "+bike.getHandle());
		System.out.println("Engine type : "+bike.getEngine());
		System.out.println("Number of seat : "+bike.getSeats());
		System.out.println("Fuel tank capacity : "+bike.getFuelTank());
		System.out.println("Head lamp type : "+bike.getLights());
		System.out.println("Number of wheels : "+bike.getWheels());
	}

}
