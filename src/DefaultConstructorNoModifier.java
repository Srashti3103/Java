/*
 * o A default constructor can be accessed only within the same package. 
 *It is used to restrict object creation to the same package.
 */
class AnimalDC {
	AnimalDC() { // Default constructor
		System.out.println("Animal constructor called.");
	}
}

public class DefaultConstructorNoModifier {

	public static void main(String[] args) {
		AnimalDC myAnimal = new AnimalDC(); // Accessible within the same package

	}

}
