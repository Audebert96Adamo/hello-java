package methods;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Area of rectangle with length = 5.4 "+ "and width 3.2");
		areaRectangle(5.4, 3.2);
		
		System.out.println("Area of rectangle with length = 10.4 "+ "and width 6.2");
		double area = areaRectangle2(10.4, 6.2);
		System.out.println(area);
		
		System.out.println("Area of rectangle with length = 9.4 "+ "and width 2.2 : "
		+areaRectangle2(9.4, 2.2));
		

	}
	public static void areaRectangle(double length, double width) {
			System.out.println(length*width);	
	}
	public static double areaRectangle2(double length, double width) {
		return length*width;	
}
}
