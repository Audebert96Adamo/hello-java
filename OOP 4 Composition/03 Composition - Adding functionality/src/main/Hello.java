package main;

import laptop.Laptop;
import laptop.components.*;

public class Hello {

	public static void main(String[] args) {
		//Processor processor = new Processor("intel", "7200U", 7, 4, 4, "6MB" + "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		//GraphicsCard graphicscard = new GraphicsCard("Nvidia", 1050, "4GB");
		Laptop gamingLaptop = new Laptop(17f, 
				new Processor("intel", "7200U", 7, 4, 4, "6MB" + "", "2.5Ghz", "2.5Ghz", "3.1Ghz"), 
				"DDRA", "2TB", 
				new GraphicsCard("Nvidia", 1050, "4GB"), 
				null, "backlit");
		
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println("Gaming mode on");
		System.out.println("Current frenquency "+gamingLaptop.getProcessor().getFrequency());

	}

}
