interface VehicleIn{
	void start();//Abstract method
	
	default void fuelType() {
		System.out.println("Default fuel type : Petrol/Diesel");
	}
}
class CarIn implements VehicleIn{
	public void start() {
		System.out.println("Car is starting ");
	}
}
public class DefaultStaticMethodsInterface {
	public  static void main(String[] args) {
		CarIn myCar = new CarIn();
		myCar.start();
		myCar.fuelType();//Calls default method
	}
}
