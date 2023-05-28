package methods;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Area of rectangle : "+area(5,5));
		System.out.println("Area of rectangle : "+area(14.5d,10.65d));
		System.out.println("Area of square : "+area(5.0d));
		System.out.println("Area of square : "+area(5));
	}
	public static double area (double length, double width) {
		return length*width;
	}
	/*public static double area (double length, double width) { 
		return length*width; //don't work because it's the same parameters than the first
	} */
	public static double area (double side) {
		return side*side;
	}
	public static int area (int side) {
		return side*side;
	}

}
