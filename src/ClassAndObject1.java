//Define a class named "Pen
class Pen{
	//Field(attributes)
	String brand;
	String color;
	double tipSize;//Size of the pen tip in millimeters
	//Method (behavior)
	void write() {
		System.out.println("Writing with a "+ tipSize +"mm "+ color+" "+brand+"pen");
	}
	void refill() {
		System.out.println("Refilling the"+color+" "+brand+"pen.");
	}
}


public class ClassAndObject1 {

	public static void main(String[] args) {
		//Create an object of the pen class 
		Pen myPen = new Pen();
		//Set the objects attributes
		myPen.brand = "Parker";
		myPen.color = "Blue";
		myPen.tipSize = 0.7;
		
		//Call the object's methods
		myPen.write();//output Writing with a 0.7mm Blue Parker pen.
		myPen.refill();//Output Refilling the Blue Parker pen.
	}

}
