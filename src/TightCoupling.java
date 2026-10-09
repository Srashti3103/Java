//Superclass
class CarTC{
	private String engineType;
	public CarTC(String engineType) {
		this.engineType = engineType;
	}
	public void startEngine() {
		if(engineType.equals("V8")) {
			System.out.println("V8 engine started");
		}else {
			System.out.println("Engine started.");
		}
	}
	
}

//Subclass
class SportsCarTC extends CarTC{
	public SportsCarTC() {
		super("V8");//Tightly coupled tp the superclass's implementation
	}
	public void race() {
		System.out.println("SportsCar is racing!");
		startEngine();//Directly using the superclass's method
	}
}
public class TightCoupling {

	public static void main(String[] args) {
		SportsCarTC myCar = new SportsCarTC();
		myCar.race();

	}

}
