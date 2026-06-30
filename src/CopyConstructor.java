class Pen3 {
	String brand;
	String color;
	double tipSize;

	// Parameterized Constructor
	Pen3(String b, String c, double t) {
		brand = b;
		color = c;
		tipSize = t;
	}

	// Copy Constructor
	Pen3(Pen3 other) {
		brand = other.brand;
		color = other.color;
		tipSize = other.tipSize;
	}

	void display() {
		System.out.println("Brand: " + brand + ", Color: " + color + ", Tip Size: " + tipSize + "mm");
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		// Create an object using the parameterized constructor
		Pen3 mypen1 = new Pen3("Parker", "Blue", 0.7);
		mypen1.display(); // Output: Brand: Parker, Color: Blue, Tip Size: 0.7mm
		// Create a copy of pen1 using the copy constructor
		Pen3 mypen2 = new Pen3(mypen1);
		mypen2.display(); // Output: Brand: Parker, Color: Blue, Tip Size: 0.7mm

	}

}
