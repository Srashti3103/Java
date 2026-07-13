//Default access modifier 
//A default class , method , or variable  can be accessed only within the same package
//Default class(no modifier)
class Animal8 {
	String name; // Default variable

	void eat() { // Default method
		System.out.println(name + " is eating.");
	}
}

public class DefaultAccessModifier {

	public static void main(String[] args) {
		Animal8 myAnimal = new Animal8();
		myAnimal.name = "Dog"; // Accessing default variable
		myAnimal.eat(); // Accessing default method

	}

}
