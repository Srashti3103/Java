/*
 * Example of Access Modifiers in Constructors:
 * Allows object creation from anywhere.
 */
class CarPC{
	public CarPC() {
		System.out.println("Car constructor called.");
	}
}
public class PublicInConstructor {
	CarPC myCar = new CarPC(); // Accessible from anywhere
}
