package main;

public class Hello {

	public static void main(String[] args) {
		Car car = new Car();
		//car.speed = 1; // public
		//System.out.println(car.speed); // public 
		car.setSpeed(10); // private
		System.out.println(car.getSpeed()); // private
	}

}
