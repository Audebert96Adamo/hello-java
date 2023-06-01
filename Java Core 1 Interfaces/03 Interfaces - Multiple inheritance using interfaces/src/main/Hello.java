package main;

import main.person.*;

public class Hello {

	public static void main(String[] args) {
		Person john = new Vegan();
		john.breath();
		john.eat();
		john.speak();
		john.message();
		System.out.println("******************");
		Person mia = new NonVegan();
		mia.breath();
		mia.speak();
		mia.eat();
		mia.message();
	}

}
