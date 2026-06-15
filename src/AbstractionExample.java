//Abstract class
abstract class VehicleAC{
	int speed = 0;//Instance variable
	//Abstract method (without  body)
	abstract void start();
	//Concrete   method (with body)
	void stop() {
		System.out.println("Vehicle is stopping.");
	}
	
}
//Subclass (child class)
class CarAC extends VehicleAC{
	//Implementing abstract mehtod 
	@Override
	void start() {
		System.out.println("Car is starting..");
	}
}

//Main class
public class AbstractionExample {
public static void main(String[] args) {
	VehicleAC myCarAC = new CarAC();//Creating object of CarAC using reference of Vehicle
	myCarAC.start();//Output: Car is starting...
	myCarAC.stop();//Output:Vehicle is stopping...
}
}
