package main;

public class Car {
	private String doors; // this.doors
	private String engine; // this.engine
	private String driver; // this.driver
	private int speed; // this.speed
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed; 
	}
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String run() {
		if (doors.equals("closed") && engine.equals("on")
				&& driver.equals("seated")&& speed >0) {
			return "running";
		} else {
			return "not running";
		}
	}
}
