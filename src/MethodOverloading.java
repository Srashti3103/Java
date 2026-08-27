/*
 * 1. Compile-time Polymorphism (Method Overloading)
 * Method Overloading occurs when multiple methods in the same class have the same
 * name but different parameters (method signature). 
 * Rules for Method Overloading 
 *  Methods must have the same name but different parameter lists.
 *  The return type can be different but is not a differentiating factor.
 *  Can occur in the same class or a child class.
 *  Achieved during compile time.
 * 
 */
class MathOperations1 {
// Method with two integers 
	int add(int a, int b) {
		return a + b;
	}

//Method with three integers 
	int add(int a, int b, int c) {
		return a + b + c;
	}

//Method with double values 
	double add(double a, double b) {
		return a + b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		MathOperations1 math = new MathOperations1();
		System.out.println("Addition of two integers: " + math.add(5, 10));
		System.out.println("Addition of three integers: " + math.add(5, 10, 15));
		System.out.println("Addition of two doubles: " + math.add(5.5, 10.5));

	}

}
