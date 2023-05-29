package main;

public class Car {
	private String doors; // this.doors
	private String engine; // this.engine
	private String driver; // this.driver
	private int speed; // this.speed

	public Car() { // setting default value for this.element of car 
		doors = "opened";
		engine = "off";
		driver = "absent";
		speed = 0;
	}
	// right click source/generate constructor using field
	public Car(String doors, String engine, String driver, int speed) { 
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	public String getDoors() {
		return doors;
	}
	public String getEngine() {
		return engine;
	}
	public String getDriver() {
		return driver;
	}
	public int getSpeed() {
		return speed;
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
