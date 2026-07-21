class CarFCOI {
	private String engineType;

	public CarFCOI(String engineType) {
		this.engineType = engineType;
	}

	public void startEngine() {
		if (engineType.equals("V8")) {
			System.out.println("V8 engine started.");
		} else {
			System.out.println("Engine started.");
		}
	}
}

class SportsCarFCOI {
	private CarFCOI car;

	public SportsCarFCOI(CarFCOI car) {
		this.car = car;
	}

	public void race() {
		System.out.println("SportsCar is racing!");
		car.startEngine();
	}
}

public class FavorCompositionOverInheritance {
	public static void main(String[] args) {
		CarFCOI myCar = new CarFCOI("V8");
		SportsCarFCOI sportsCar = new SportsCarFCOI(myCar);
		sportsCar.race();
	}
}
