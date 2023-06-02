package main;

import main.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		System.out.println(door.getLock().isUnlocked("qwerty"));
		if (door.getLock().isUnlocked("test")) {
			System.out.println("Welcome wa are open");
		} else {
			System.out.println("We're closed now, please visit later");
		}
	}

}
