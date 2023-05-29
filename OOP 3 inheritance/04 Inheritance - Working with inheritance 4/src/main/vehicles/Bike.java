package main.vehicles;

import main.parent.Vehicle;

public class Bike extends Vehicle{
	private String handle;

	public Bike() {
		super();
		this.handle = "short";
	}

	public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights); 
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	// right click, source/generate toString()/deselect all fields then select all methods & inherit method
	// deselect getClass(), hashCode() & toString 
	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}
	
}
