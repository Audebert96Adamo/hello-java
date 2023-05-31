package main;

import laptop.Laptop;

public class Hello {

	public static void main(String[] args) {
		Laptop lappy = new Laptop();
		
		System.out.println(lappy);
		
		System.out.println(lappy.getProcessor());
		System.out.println(lappy.getProcessor().getBrand());
		
		System.out.println(lappy.getGraphicsCard());
		System.out.println(lappy.getGraphicsCard().getMemory());
	}

}
