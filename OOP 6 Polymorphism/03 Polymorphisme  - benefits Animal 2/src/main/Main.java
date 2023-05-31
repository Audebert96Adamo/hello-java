package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.reptile.Reptile;
import animal.reptile.Crocodile;
import animal.fish.Fish;
import animal.fish.Eel;
import animal.bird.Bird;
import animal.bird.Eagle;

public class Main {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>();
		
		Animal animal = new Animal();
		
		//Reptile reptile = new Reptile();
		//System.out.println(reptile.showInfo());
		//Crocodile croc = new Crocodile();
		//System.out.println(croc.showInfo());
		
		//Fish fish = new Fish();
		//System.out.println(fish.showInfo());
		//Eel eel = new Eel();
		//System.out.println(eel.showInfo());
		
		//Bird bird = new Bird();
		//System.out.println(bird.showInfo());
		//Eagle eagle = new Eagle();
		//System.out.println(eagle.showInfo());
		
		Animal reptile = new Reptile();	
		Animal croc = new Crocodile();	
		Animal fish = new Fish();
		Animal eel = new Eel();		
		Animal bird = new Bird();
		Animal eagle = new Eagle();
	
		animals.add(animal);
		animals.add(reptile);
		animals.add(croc);
		animals.add(fish);
		animals.add(eel);
		animals.add(bird);
		animals.add(eagle);
		listAnimals(animals);
		
	}
	
	public static void listAnimals(List<Animal> animals) {
		for(Animal animal: animals ) {
			System.out.println(animal.showInfo());
		}
	}

}
