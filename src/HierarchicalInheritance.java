/*
 * Hierarchical Inheritance 
 * Multiple subclass inherit from a single superclass
 * Animal , dog class are  written in single and multiple inheritance program  
 * 
 */
//Subclass 2 
class Cat extends Animal {
	void meow() {
		System.out.println("Cat is meowing.");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat(); // Inherited from Animal
		myDog.bark(); // Method from Dog
		Cat myCat = new Cat();
		myCat.eat(); // Inherited from Animal
		myCat.meow(); // Method from Cat

	}

}
