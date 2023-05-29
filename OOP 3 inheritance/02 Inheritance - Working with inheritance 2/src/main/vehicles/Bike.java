package main.vehicles;

import main.parent.Vehicle;

public class Bike extends Vehicle{
	private String handle;

	public Bike() {
		super();
		this.handle = "short";
	}

	public Bike(String handle) {
		super();
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}
	
	
}
