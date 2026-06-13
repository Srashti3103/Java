/*
 * o Abstraction is the process of hiding complex implementation details and
 * showing only the necessary features of an object.
 * It is achieved using abstract classes and interfaces.
 */

abstract class Shape { // Abstract class
	abstract void draw(); // Abstract method
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a circle.");
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		Shape myShape = new Circle();
		myShape.draw(); // Output: Drawing a circle.

	}

}
