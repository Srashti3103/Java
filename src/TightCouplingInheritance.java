//Scenario
//A car class is the superclass , and  a sportsCar class is the subclass.

//Superclass 
class Car2 {
	private String engineType;

	public Car2(String engineType) {
		this.engineType = engineType;
	}

	public void startEngine() {
		if (engineType.equals("VB")) {
			System.out.println("VB engine started.");
		} else {
			System.out.println("Engine started.");
		}
	}
}

//Subclass 
class SportsCar extends Car2 {
	public SportsCar() {
		super("V8"); // Tightly coupled to the superclass's implementation
	}

	public void race() {
		System.out.println("SportsCar is racing!");
		startEngine(); // Directly using the superclass's method
	}
}

public class TightCouplingInheritance {

	public static void main(String[] args) {
		SportsCar myCar = new SportsCar();
		myCar.race();

	}

}
