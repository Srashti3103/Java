//Calling Constructors (Constructor Chaining) 
//this() is used to call one constructor from another constructor in the same class.
class PenB {
	String brand;
	String color;
	double tipSize;

	// Default Constructor
	PenB() {
		this("Unknown", "Black", 0.5);// Calls the parameterized constructor
	}

	// Parameterized Constructor
	PenB(String brand, String color, double tipSize) {
		this.brand = brand;
		this.color = color;
		this.tipSize = tipSize;
	}

	void display() {
		System.out.println("Brand: " + this.brand + ", Color: " + this.color + ", Tip Size: " + this.tipSize + "mm");
	}
}

public class UseOfThis2 {

	public static void main(String[] args) {
		PenB myPen = new PenB();//Calls the default constructor
		myPen.display();// Output: Brand: Unknown, Color: Black, Tip Size: 0.5mm
	}

}
