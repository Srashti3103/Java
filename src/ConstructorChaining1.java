/*
 * Constructor chaining 
 * constructor can all other constructor in the same class using this() or in the superclass using super().
 * 
 */
class Animal5 {
	String name;

	Animal5() {
		this("Unknown");// call another constructor in the same class
		System.out.println("Animal default constructor called.");
	}

	Animal5(String name) {
		this.name = name;
		System.out.println("Animal parameterized constructor called Name :" + name);
	}
}

//Subclass 
class Dog5 extends Animal5 {
	String breed;

	Dog5() {
		this("Unknown", "Unknown");// Call another constructor in the same class
		System.out.println("Dog default constructor called.");
	}

	Dog5(String name, String breed) {
		super(name);// Call the super class constructor
		this.breed = breed;
		System.out.println("Dog parameterized constructor called Breed :" + breed);
	}
}

public class ConstructorChaining1 {

	public static void main(String[] args) {
		Dog5 myDog5 = new Dog5("Buddy", "Golden Retriever");

	}

}
