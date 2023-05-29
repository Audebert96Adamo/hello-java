package main;

import main.vehicles.Bike;
import main.vehicles.Car;
import main.vehicles.Truck;


public class Demo {

	public static void main(String[] args) {
		Bike bike = new Bike("long", "Diesel", 4, 4, 40, "LED");
		bike.run();
		
		Car car = new Car();
		car.run();
		
		Truck truck = new Truck();
		truck.run();
	}

}
