package main;

import main.phone.Nokia3310;
import main.phone.Phone;
import main.phone.SamsungNotes8;

public class Hello {

	public static void main(String[] args) {
		/*
		Phone phone = new Phone("Nokia 3310");
		System.out.println(phone.getModel());
		phone.features();
		
		SamsungNotes8 note8 = new SamsungNotes8("Note 8");
		System.out.println(note8.getModel());
		note8.features();
		*/
		Phone note8 = new SamsungNotes8("Note 8");
		System.out.println(note8.getModel());
		note8.features(); // because features is defined in SansungNotes8 it will show the value of SansungNotes8 features()
		
		Phone nokia3310 = new Nokia3310("Nokia 3310");
		System.out.println(nokia3310.getModel());
		// because features is not defined in Nokia3310 it will show the value of Phone features()
		// as Nokia3310 is extends Phone so it's default value of features() is that of Phone 
		nokia3310.features(); 
		/*

		 So to summarize it properly we have :
		 
		 1/ The class Phone
		 2/ Nokia3310 & SumsungNotes8 are classes extends of Phone
		 
		 3/ In Phone we have a function by the name of features() with a value of "Feature phone"
		 4/ In Note8 we create the same function with a different value "Andriod flagship"
		 5/ But in Nokia3310 we don't have this function 
		 
		 6/ So in Hello.java when we print the value of note8.features() we get "Andriod flagship"
		 7/ And for Nokia3310 we get "Feature phone" because features() is inherit by Phone so it take it as default value
		 
		 8/ So features() can be called by the same name but can have different value this is what polymorphism is about.
		 
		 */
	}

}
