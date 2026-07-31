/*
 * o Polymorphism allows objects to take on multiple forms. It enables a single 
method or operator to behave differently based on the context. 
o There are two types of polymorphism in Java: 
 */

/*
 *  Compile-time Polymorphism (Method Overloading): 
 Multiple methods in the same class with the same name but 
different parameters. 
 */

class MathOperations {
	int add(int a, int b) {
		return a + b;
	}

//call- add(4,6) 
	double add(double a, double b) { // call  add(4.5,6.8)
		return a + b;
	}
}

/*
 *  Runtime Polymorphism (Method Overriding):  A subclass provides a specific
 * implementation of a method that is already defined in its superclass.
 * 
 */

class AnimalA{
	void sound() {
		System.out.println("Animal makes a sound.");
	}

	
}

class DogA extends AnimalA {
	@Override
	void sound() {
		System.out.println("Dog barks.");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		AnimalA myDogA = new DogA();
		myDogA.sound(); // Output: Dog barks.
	}

}
