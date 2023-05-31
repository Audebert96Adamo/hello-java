package main;

public class Hello {

	public static void main(String[] args) {
		Person john = new Person(); // default constructor
		System.out.println(john);
		
		// john.name = "John"; // if public 
		// john.age = -10; // if public // here you can set a negative value for the age 
		//System.out.println(john);
		
		Person pooja = new Person("Pooja", -20, "Female"); // constructor
		System.out.println(pooja);
		
		pooja.setName("Yuki"); // if private use setters
		// here we can't enter a negative value because of the if() statement in setAge (see setAge & constructor in Person.java)
		// if a negative value is detected Person will return it's default value "0"
		pooja.setAge(30); // if private use setters
		System.out.println(pooja);  

	}

}
