/*
 * Restricts object creation to the  same package
 * 
 */
class BikeDC{
	BikeDC(){
		//Default constructor
		System.out.println("Bike constructor called.");
	}
}
public class DefaultInConstructor {
	public static void  main(String[] args) {
		BikeDC myBike = new BikeDC();//Accessible within the same  package
	}
}
