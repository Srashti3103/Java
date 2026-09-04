/*
 * A private constructor can be accessed only within the same class. 
 * It is commonly used in Singleton design patterns to restrict object creation.
 * 
 */
class Singleton {
	private static Singleton instance;

	// private constructor
	private Singleton() {
		System.out.println("Singleton constructor called .");
	}

//public method to access the singleton instance
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class PrivateConstructor {

	public static void main(String[] args) {
		// Singleton obj = new Singleton(); // Error: Constructor is private
		Singleton obj = Singleton.getInstance(); // Access via public method
	}

}
