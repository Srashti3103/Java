/*
 * Referencing Instance Variables 
When a local variable (e.g., a method parameter) has the same name as an instance 
variable, this is used to refer to the instance variable. 
 */
class PenA {
	String brand;
	String color;
	double tipSize;

//Parameterized Constructor
	PenA(String brand, String color, double tipSize) {
		//Use "this"  to refer to instance variables
		this.brand = brand;
		this.color = color;
		this.tipSize = tipSize;
		
	}
	void display() {
		System.out.println("Brand: "+this.brand+",Color:"+this.color+",TipSize:"+this.tipSize+"mm");
	}
}

public class UseOfThis1 {

	public static void main(String[] args) {
		PenA myPen = new PenA("Parker","Blue",0.7);
		myPen.display();//Output: Brand: Parker,Color:Blue,TipSize:0.7mm
	}

}
