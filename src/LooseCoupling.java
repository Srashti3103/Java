// Interface (Abstraction) 
interface EngineLoosCoup {
	void start();
}

//Concrete Implementation 1 
class V8EngineLoosCoup implements EngineLoosCoup {
	public void start() {
		System.out.println("V8 engine started.");
	}
}

//Concrete Implementation 2 
class ElectricEngine implements EngineLoosCoup {
	public void start() {
		System.out.println("Electric engine started.");
	}

}

//High-level  Class (Loosely Coupled) 
class CarLoosCoup {
	private EngineLoosCoup engine;

// Dependency Injection (Constructor Injection) 
	public CarLoosCoup(EngineLoosCoup engine) {
		this.engine = engine;
	}

	public void startEngine() {
		engine.start();
	}
}

public class LooseCoupling {
	public static void main(String[] args) {
		// Use V8Engine
		EngineLoosCoup v8Engine = new V8EngineLoosCoup();
		CarLoosCoup car1 = new CarLoosCoup(v8Engine);
		car1.startEngine(); // Output: V8 engine started.

		// Use ElectricEngine
		EngineLoosCoup electricEngine = new ElectricEngine();
		CarLoosCoup car2 = new CarLoosCoup(electricEngine);
		car2.startEngine(); // Output: Electric engine started.
	}
}
