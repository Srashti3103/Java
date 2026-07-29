/*
 * 2. Runtime Polymorphism (Method Overriding)
 * Method Overriding occurs when a subclass provides a specific implementation of a
 * method already defined in its parent class. 
 * Rules for Method Overriding
 *  The method name and parameters must be the same as in the parent class.
 *  The return type must be the same or a subclass (from Java 5 onwards). 
 *  The method in the parent class must not be private or final.
 *  Achieved during runtime using dynamic method dispatch.
 */

// Parent class 
class AnimalD {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Child class 
class DogD extends AnimalD {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}

//Another child class 
class CatD extends AnimalD {
	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		AnimalD myAnimal; // Reference of parent class
		myAnimal = new DogD();
		myAnimal.makeSound(); // Output: Dog barks
		myAnimal = new CatD();
		myAnimal.makeSound(); // Output: Cat meows

	}

}
