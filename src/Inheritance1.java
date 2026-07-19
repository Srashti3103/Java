/*
 * o Inheritance allows a class (subclass/child class) to inherit properties and 
     behaviors from another class (superclass/parent class). 
   o It promotes code reusability and establishes a relationship between classes.
 */

class Vehicle { // Parent class
	void run() {
		System.out.println("Vehicle is running.");
	}
}

class Car1 extends Vehicle { // Child class
	void accelerate() {
		System.out.println("Car is accelerating.");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Car1 myCar1 = new Car1();
		myCar1.run(); // Inherited method
		myCar1.accelerate(); // Child class method
	}

}
