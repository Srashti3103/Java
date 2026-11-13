/*
 * Parameterized Constructor in superclass 
 * if the super class has  a parameterized constructor , the subclass must explicitly call it using super (...)
 * 
 */
//Superclass
class Animal3 {
	String name;

	Animal3(String name) {
		this.name = name;
		System.out.println("Animal constructor called. Name: " + name);
	}
}

//Subclass 
class Dog3 extends Animal3 {
	String breed;

	Dog3(String name, String breed) {
		super(name); // Call the superclass constructor
		this.breed = breed;
		System.out.println("Dog constructor called. Breed: " + breed);
	}
}

public class ParameterizedConstructorSuperClass {

	public static void main(String[] args) {
		Dog3 myDog3 = new Dog3("Buddy", "Golden Retriever");

	}

}
