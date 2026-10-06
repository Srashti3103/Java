interface Utility{
	static void printMessage() {
		System.out.println("Static mehtod in interface");
	}
}
public class StaticMethodInInterface {
	public static void main(String[] args) {
		Utility.printMessage();//Directly called using interface name
	}
}
