// Returning the Current Object
//this can be returned from a method to represent the current object.

class PenD {
	String brand;
	String color;

	PenD(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	PenD setBrand(String brand) {
		this.brand = brand;
		return this; // Return the current object
	}

	PenD setColor(String color) {
		this.color = color;
		return this; // Return the current object
	}

	void display() {
		System.out.println("Brand: " + this.brand + ", Color: " + this.color);
	}
}

public class UseOfThis4 {

	public static void main(String[] args) {
		   PenD myPen = new PenD("Parker", "Blue"); 
	        myPen.setBrand("Pilot").setColor("Red").display(); // Output: Brand: Pilot, Color: Red

	}

}
