interface EngineAbs{
	void start();
}
class V8Engine implements EngineAbs{
	public void start() {
		System.out.println("V8 engine started");
	}
}

class CarAvo{
	private EngineAbs engine;
	public CarAvo(EngineAbs engine) {
		this.engine = engine;
	}
	public void startEngine() {
		engine.start();
	}
}
class SportsCarAbs extends CarAvo{
	public SportsCarAbs(EngineAbs engine) {
		super(engine);
	}
	public void race() {
		System.out.println("SportsCar is racing!");
		startEngine();
	}
}
public class AvoidTightCouplingInheritance {
	public static void main(String[] args) {
		EngineAbs v8Engine = new V8Engine();
		SportsCarAbs myCar = new SportsCarAbs(v8Engine);
		myCar.race();
	}
}
