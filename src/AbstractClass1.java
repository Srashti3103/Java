//Abstract class
abstract class VehicleAbs{
	int speed = 0;//instance variable 
	
	//Abstract method(without body)
	abstract void start();
	
	//Concrete method (with body)
	void stop() {
		System.out.println("Vehicle is stopping....");
	}
}

//Subclass (child class)
class CarAbs extends VehicleAbs{
	//Implementing abstract method
	@Override
	void start() {
		System.out.println("Car is starting...");
	}
}
public class AbstractClass1 {
	public static void main(String[] args) {
		VehicleAbs myCar = new CarAbs();//Creating object of car using reference of  vehicle 
		myCar.start();// Output: Car is starting...
		myCar.stop();// Output: Vehicle is stopping... 
	}
}
