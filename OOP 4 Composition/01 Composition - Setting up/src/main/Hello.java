package main;

import laptop.Laptop;
import laptop.components.*;

public class Hello {

	public static void main(String[] args) {
		Laptop lappy = new Laptop();
		System.out.println(lappy);

		GraphicsCard graph = new GraphicsCard();
		System.out.println(graph);
		
		Processor processor = new Processor();
		System.out.println(processor);
	}

}
