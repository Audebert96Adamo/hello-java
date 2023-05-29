package main;

import main.vehicles.Bike;
import main.vehicles.Car;
import main.vehicles.Truck;


public class Demo {

	public static void main(String[] args) {
		Bike bike = new Bike("long", "Diesel", 4, 4, 40, "LED");
		System.out.println(bike);
		
		Car car = new Car();
		System.out.println(car);
		
		Truck truck = new Truck();
		System.out.println(truck);
	}

}
