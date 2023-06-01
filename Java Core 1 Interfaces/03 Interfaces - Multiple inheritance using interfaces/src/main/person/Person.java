package main.person;

public abstract class Person implements IsAlive,LiveLife {
	public void speak() {
		System.out.println("Share his/her thought.");
	}
	
	@Override
	public void breath() {
		System.out.println("Be alive; remain living.");
	}
	@Override
	public void message() {
		System.out.println("Life is journey; keep moving & meet new people");
	}
	public abstract void eat();

}
