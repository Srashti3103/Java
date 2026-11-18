/*
 * Allows subclassing but restricts direct object creation. 
 * 
 */ 
//Public class  VehiclePro{
class VehicleProCon{
	 protected VehicleProCon() {
		 System.out.println("Vehicle constructor called.");
	 }
}
class CarProCon extends VehicleProCon{
	public CarProCon() {
		super();//Accessing protected constructor 
		System.out.println("Car Constructor  called.");
	}
}

public class ProtectedInConstructor {
	public static void main(String[] args) {
		//Vehicle vehicle  = new Vehicle();//Error : constructor is protected 
		CarProCon myCar = new CarProCon();//Accessible via subclass
	}
}
