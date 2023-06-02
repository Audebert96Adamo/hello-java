package main;

import main.testrun.TestStatic;

public class App {

	public static void main(String[] args) {
		//TestStatic obj1 = new TestStatic();
		//System.out.println("Obj1 current variable value : "+obj1.getStaticVariable());
		
		//obj1.setStaticVariable(100);
		//System.out.println("Obj1 current variable value : "+obj1.getStaticVariable());
		
		//TestStatic obj2 = new TestStatic();
		//System.out.println("Obj1 current variable value : "+obj2.getStaticVariable());
		
		//obj2.setStaticVariable(50);		
		//System.out.println("Obj1 current variable value : "+obj2.getStaticVariable());

		//TestStatic obj3 = new TestStatic();
		//System.out.println("Obj1 current variable value : "+obj3.getStaticVariable());
	
		
		System.out.println("Current variable value : "+TestStatic.getStaticVariable());
		
		TestStatic.setStaticVariable(100);
		System.out.println("Current variable value : "+TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(50);
		System.out.println("Current variable value : "+TestStatic.getStaticVariable());
	}

}
