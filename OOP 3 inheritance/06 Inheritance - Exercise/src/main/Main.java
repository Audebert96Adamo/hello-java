package main;

import animal.Animal;
import animal.reptile.Reptile;
import animal.reptile.Crocodile;
import animal.fish.Fish;
import animal.fish.Eel;
import animal.bird.Bird;
import animal.bird.Eagle;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		System.out.println(animal.showInfo());
		
		Reptile reptile = new Reptile();
		System.out.println(reptile.showInfo());
		Crocodile croc = new Crocodile();
		System.out.println(croc.showInfo());
		
		Fish fish = new Fish();
		System.out.println(fish.showInfo());
		Eel eel = new Eel();
		System.out.println(eel.showInfo());
		
		Bird bird = new Bird();
		System.out.println(bird.showInfo());
		Eagle eagle = new Eagle();
		System.out.println(eagle.showInfo());
	}

}
