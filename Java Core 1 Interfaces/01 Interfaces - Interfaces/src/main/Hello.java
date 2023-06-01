package main;

import main.phone.Phone;
import main.phone.Iphone8;
import main.phone.OnePlus5;

public class Hello {

	public static void main(String[] args) {
		
		Phone phone = new OnePlus5();
		Phone iphone = new Iphone8();
		System.out.println("Processor: "+phone.processor());
		System.out.println("Space In GB: "+phone.spaceInGB());
		System.out.println("Processor: "+iphone.processor());
		
		
		
	}

}
