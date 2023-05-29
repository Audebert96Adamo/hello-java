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

	// right click, source/generate toString()/deselect all fields then select all methods & inherit method
	// deselect getClass(), hashCode() & toString 
	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + "]";
	}	
	
	public void run() {
		System.out.println("Running truck");
		System.out.println(toString());
	}
	
}
