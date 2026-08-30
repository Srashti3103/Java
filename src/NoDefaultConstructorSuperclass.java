/*
 * No Default constructor in super class
 * if the superclass does not have a default constructor , the subclass must explicitly call one of the superclass's parameterized constructors.
 * 
 */
//Superclass 
class Animal4 {
	String name;

	Animal4(String name) {
		this.name = name;
		System.out.println("Animal constructor called. Name: " + name);
	}
}

// Subclass 
class Dog4 extends Animal4 {
	Dog4(String name) {
		super(name); // Must call the superclass constructor
		System.out.println("Dog constructor called.");
	}
}

public class NoDefaultConstructorSuperclass {

	public static void main(String[] args) {
		Dog4 myDog4 = new Dog4("Buddy");

	}

}
