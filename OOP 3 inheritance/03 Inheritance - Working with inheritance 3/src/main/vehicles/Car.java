package main.vehicles;

import main.parent.Vehicle;

public class Car extends Vehicle{
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmeSystem;
	
	
	public Car() {
		super();
		this.steering = "someValue";
		this.musicSystem = "someValue";
		this.airConditioner = "someValue";
		this.fridge = "someValue";
		this.entertainmeSystem = "someValue";
	}
	
	public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmeSystem) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmeSystem = entertainmeSystem;
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
	public String getFridge() {
		return fridge;
	}
	public String getEntertainmeSystem() {
		return entertainmeSystem;
	}
	
}
