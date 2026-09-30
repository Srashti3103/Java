//Passing the current object 
//This can be passed as an argument to a method or constructor to represent the current object .

class Writer{
	void write(PenC pen) {
		System.out.println("Writing with a " + pen.color + " " + pen.brand + " pen.");
	}
}
class PenC{
	String brand ;
	String color;
	PenC(String brand , String color){
		this.brand = brand;
		this.color=color;
	}
	void startWriting(Writer writer) {
		writer.write(this);//Pass the current object to the write method 
	}
}
public class UseThis3 {

	public static void main(String[] args) {
		PenC myPen = new PenC("Parker ","Blue");
		Writer writer = new Writer();
		myPen.startWriting(writer);//Output: Writing with a Blue Parker pen. 

	}

}
