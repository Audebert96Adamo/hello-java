package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		// widening : byte->short->int->long->float->double
		// narrowing : double->float->long->int->short->byte
		
		short x = 5;
		int y = x;
		System.out.println(y);
		
		//int y2 = 10;
		//short x2 = y2;
		//System.out.println(y2);
		
		// Automatic type casting take place when : 
		// 1/ the two types are compatible 
		// 2/ the target type is larger than the source type 
		// x & y ( the first sysout ) are an example of automatic type casting 
		// because int (y) is larger than short (x) 

		int y2 = 10;
	    short x2 = (short)y2;
		System.out.println(x2);
		
		int y3 = 15;
	    short x3 = (byte)y3;
		System.out.println(x3);
		
		// for the 2nd & 3rd sysout we have an example of narrowing our int to make it (short) or (byte)
		
		float v1 = 20.0f;
		double v2 =  v1;
		System.out.println(v2);
		
		double v3 =  25.0123456789d;
		float v4 = (float)v3;
		System.out.println(v4);
		
		// so as we can see when it comes to widening a type the casting is done automatically
		// but when we need to narrow we must use ()
		
		int a = 25;
		float b = 42.159f;
		int value = (int)(a*a + 2*(a*b) + b*b);
		System.out.println(value);
		
	}

}
