//Parametrized
class Pen2 {
	String brand;
	String color;
	double tipSize;

	// Parameterized Constructor
	Pen2(String b, String c, double t) {
		brand = b;
		color = c;
		tipSize = t;
	}

	void display() {
		System.out.println("Brand: " + brand + ", Color: " + color + ", Tip Size: " + tipSize + "mm");
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		/*
		 * Parameterized Constructor: o A constructor with parameters is called a
		 * parameterized constructor. o It is used to initialize the object with
		 * specific values.
		 */
		// Create an object using the parameterized constructor
		Pen2 myPen = new Pen2 ("Parker", "Blue", 0.7);
		myPen.display(); // Output: Brand: Parker, Color: Blue, Tip Size: 0.7mm
	}

}
