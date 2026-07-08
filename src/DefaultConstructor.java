//Type of constructor 
		/*
		 * 1. default constructor 
		 * Zero argument constructor 
		 * 
		 */
class Pen1{
	String brand ;
	String color;
	double tipSize;
	
	//Constructor 
	Pen1(){
		brand = "Unknown";
		color = "Black";
		tipSize = 0.5;
	}
	
	void Display() {
		System.out.println("Brand:"+brand+".color"+" TipSize "+tipSize+"mm");
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		//Create an object using the default constructor
		Pen1 myPen1 = new Pen1();
		myPen1.Display();//output brand unknown . color clack , Tip Size : 0.5mm
	}

}
