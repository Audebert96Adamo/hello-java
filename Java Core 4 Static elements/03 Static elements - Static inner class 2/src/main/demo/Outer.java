package main.demo;

public class Outer {
	//private static int testVar = 5;
	
	public static void testOuterMethod() {
		System.out.println("value of inner class variable : "+Inner.x);
		Inner.testingInnerMethod();
	}
	public static class Inner{
		//private static int x = 0;
		public static int x = 0;
		public static void testingInnerMethod() {
			System.out.println("Testing inner class method.");
			//System.out.println("Test variable value : "+testVar);
			//testOuterMethod();
		}
		
	}
}
