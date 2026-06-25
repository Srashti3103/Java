class Pen4 {
	String brand;
	String color;
	double tipSize;

	// Default Constructor
	Pen4() {
		this("Unknown", "Black", 0.5); // Calls the parameterized constructor
	}

	// Parameterized Constructor
	Pen4(String b, String c, double t) {
		brand = b;
		color = c;
		tipSize = t;
	}

	void display() {
		System.out.println("Brand: " + brand + ", Color: " + color + ", Tip Size: " + tipSize + "mm");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		// Create an object using the default constructor
		Pen4 myPen = new Pen4();
		myPen.display(); // Output: Brand: Unknown, Color: Black, Tip Size: 0.5mm
	}

}
