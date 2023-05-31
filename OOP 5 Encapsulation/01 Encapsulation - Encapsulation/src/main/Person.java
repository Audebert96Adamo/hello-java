package main;

public class Person {
	private String name = "John";
	private int age = 25;
	private String gender = "male";
	
	
	
	public Person() {
		this.name = "john Doe";
		this.age = 25;
		this.gender = "Male";
	}
	

	public Person(String name, int age, String gender) {
		
		this.name = name;
		if(age >= 0 && age <= 100) {
		this.age = age;
		} else {
			this.age = 0;
		}
		this.gender = gender;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean setAge(int age) {
		if(age >= 0 && age <= 100) {
			this.age = age;
			return true;
		}
		return false;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
