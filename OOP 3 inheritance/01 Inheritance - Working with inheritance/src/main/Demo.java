package main;

import main.vehicles.Bike;

public class Demo {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.handle = "short";
		bike.engine = "Petrol";
		System.out.println(bike);
	}

}
