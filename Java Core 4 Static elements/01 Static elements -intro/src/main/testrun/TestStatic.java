package main.testrun;

public class TestStatic {
	private static int staticVariable = 0;

	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		//this.staticVariable = staticVariable;
		TestStatic.staticVariable = staticVariable;
	}


}