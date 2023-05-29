package main.vehicles;

import main.parent.Vehicle;

public class Truck extends Vehicle{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private int container;
	
	public Truck() {
		super();
		this.steering = "someValue";
		this.musicSystem = "someValue";
		this.airConditioner = "someValue";
		this.container = 10;
	}

	public Truck(String steering, String musicSystem, String airConditioner, int container) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.container = container;
	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public int getContainer() {
		return container;
	}	
	
}
