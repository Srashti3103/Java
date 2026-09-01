/*
 * Method Overriding in Inheritance
 *  Method Overriding occurs when a subclass provides a specific implementation of a
 * method that is already defined in its superclass.
 *  The method in the subclass must have the same name, return type,
 * and parameters as the method in the superclass.
 */

class AnimalC{
	void sound() {
		System.out.println("Animal makes a sound.");
	}
}

class DogC extends AnimalC {
	@Override
	void sound() {
		System.out.println("Dog barks.");
	}
}

public class OverridingInheritance {

	public static void main(String[] args) {
		AnimalC myDog = new DogC();
		myDog.sound(); // Output: Dog barks.

	}

}
