class AnimalB {
	// Attribute
	String name;

	// Constructor
	AnimalB(String name) {
		this.name = name;
	}

	// Method
	void sound() {
		System.out.println("Animal makes a sound.");
	}
}

//Inheritance 
class DogB extends AnimalB {
	// Constructor
	DogB(String name) {
		super(name); // Call the parent class constructor
	}

	// Method Overriding (Polymorphism)
	@Override
	void sound() {
		System.out.println(name + " barks.");
	}
}

public class OOPInJava {

	public static void main(String[] args) {
		// Object
		DogB myDog = new DogB("Buddy");
		myDog.sound(); // Output: Buddy barks.
	}

}
