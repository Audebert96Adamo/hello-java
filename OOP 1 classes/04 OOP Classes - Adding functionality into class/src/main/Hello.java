package main;

public class Hello {

	public static void main(String[] args) {
		Car car = new Car();
		//System.out.println(car.run());
		car.setDoors("closed");
		car.setDriver("seated");
		car.setEngine("on");
		car.setSpeed(10);
		System.out.println(car.run());
		
		car.setDoors("not closed");
		car.setDriver("seated");
		car.setEngine("on");
		car.setSpeed(10);
		System.out.println(car.run());
	}

}
