public class MethodsExplain {
	// To explain methods in java

	// 1. NO return, NO parameter method
	public void greet() {
		System.out.println("Hello, World!");
	}

	// 2. NO return, with parameters
	public void printSum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum: " + sum);
	}

	// 3. Return, NO parameters
	public int getRandomNumber() {
		return (int) (Math.random() * 100); // Returns a random number between 0 and 99
	}

	// 4. Return, with parameters
	public int multiply(int a, int b) {
		return a * b; // Returns the product of a and b
	}

	// 1. Based on return types

	// Void Methods: Do not return any value. They perform an action but do not
	// produce a result
	public void printMessage() {
		System.out.println("Hello, World!");
	}

	// Non-void Methods: return a value of a specific data type ( example: int,
	// String, double etc.)
	public int add(int a, int b) {
		return a + b;
	}

	// 2. Based on parameters

	// Parametrized Methods: accept one or more parameters(arguments) to perform
	// operations
	public int multi(int a, int b) {
		return a * b;
	}

	// Non-parametrized Methods: Do not accept any parameters.
	public String getGreeting() {
		return "Hello!";
	}

	// 3. Based on access modifiers

	// Public Methods: accessible from any other class
	public void display() {
		System.out.println("Public Method");
	}

	// Private Methods: accessible only within the class they are defined
	private void secretOperation() {
		System.out.println("Private Method");
	}

	// Protected Methods: accessible within the same package and subclasses ( even
	// in different packages )
	protected void show() {
		System.out.println("Protected Method");
	}

	// Default (package-Private) Methods: accessible only within the same package (
	// no explicit modifier )
	void defaultMethod() {
		System.out.println("Default Method");
	}

	// 4. Based on behaviour

	// Instance Methods: Belong to an instance of a class and operate on instance
	// variables. They require an object to be called.
	public class Calculator {
		public int add(int a, int b) {
			return a + b;
		}
	}

	// Static Methods: Belong to the class rather than an instance. They can be
	// called using the class name
	public class MathUtils {
		public static int square(int num) {
			return num * num;
		}
	}

	// Abstract Methods: Declared without an implementation in an abstract class or
	// interface. Must be overridden in a subclass.
	public abstract class Shape {
		public abstract void draw();
	}

	// Final Methods: Cannot be overridden by subclasses.
	public class Parent {
		public final void display() {
			System.out.println("Cannot override this method.");
		}
	}

	// Synchronized Methods: Used in multithreading to ensure that only one thread
	// can execute the method at a time.
	static int counter = 0;

	public synchronized void increment() {
		counter++;
	}

	// 5. Based on special use cases

	// Constructor Methods: Special methods used to initialize objects. They have
	// the same name as the class and no return type
	public class Person {
		public Person() {
			System.out.println("Constructor called.");
		}
	}

	// Getter and Setter Methods: Used to access and modify private instance
	// variables (encapsulation).
	public class Student {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	// Recursive Methods: Call themselves to solve a problem by breaking it into
	// smaller subproblems.
	public int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	// Varargs Methods: Accept a variable number of arguments of the same type.
	public int sum(int... numbers) {
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}
	// 6. Based on Overloading and overrriding

	// Overloaded Methods: Multiple methods with the same name but different
	// parameters (compile-time polymorphism).
	public class MathOps {
		public int add(int a, int b) {
			return a + b;
		}

		public double add(double a, double b) {
			return a + b;
		}
	}

	// Overridden Methods: Methods in a subclass that have the same signature as a
	// method in the superclass (runtime polymorphism).
	public class Animal {
		public void sound() {
			System.out.println("Animal makes a sound");
		}
	}

	public class Dog extends Animal {
		// Override
		public void sound() {
			System.out.println("Dog barks");
		}

	}

	// 7. Functional Interface methods
	// Lambda Expressions: Used to implement functional interfaces (interfaces with
	// a single abstract method).
	interface Greeting {
		void greet(String message);
	}

	public class Main {
		public static void main(String[] args) {
			Greeting greeting = (message) -> System.out.println(message);
			greeting.greet("Hello, Lambda!");
		}
	}

	public static void main(String[] args) {

	    MethodsExplain obj = new MethodsExplain();

	    // 1. No return no parameter
	    obj.greet();

	    // 2. No return with parameters
	    obj.printSum(10, 20);

	    // 3. Return no parameter
	    int random = obj.getRandomNumber();
	    System.out.println("Random Number: " + random);

	    // 4. Return with parameters
	    int product = obj.multiply(5, 6);
	    System.out.println("Product: " + product);

	    // Void method
	    obj.printMessage();

	    // Non-void method
	    int addition = obj.add(4, 7);
	    System.out.println("Addition: " + addition);

	    // Parameterized method
	    int mul = obj.multi(3, 8);
	    System.out.println("Multiplication: " + mul);

	    // Non-parameterized method
	    String greeting = obj.getGreeting();
	    System.out.println(greeting);

	    // Public method
	    obj.display();

	    // Private method
	    obj.secretOperation();

	    // Protected method
	    obj.show();

	    // Default method
	    obj.defaultMethod();

	    // Instance method
	    Calculator calc = obj.new Calculator();
	    System.out.println("Calculator Add: " + calc.add(5, 9));

	    // Static method
	    System.out.println("Square: " + MathUtils.square(5));

	    // Constructor method
	    Person p = obj.new Person();

	    // Getter and Setter
	    Student s = obj.new Student();
	    s.setName("Rudra");
	    System.out.println("Student Name: " + s.getName());

	    // Recursive method
	    int fact = obj.factorial(5);
	    System.out.println("Factorial: " + fact);

	    // Varargs method
	    int total = obj.sum(1, 2, 3, 4, 5);
	    System.out.println("Varargs Sum: " + total);
	    																												
	    // Method Overloading
	    MathOps math = obj.new MathOps();
	    System.out.println("Int Add: " + math.add(5, 6));
	    System.out.println("Double Add: " + math.add(5.5, 6.5));

	    // Method Overriding
	    Dog dog = obj.new Dog();
	    dog.sound();

	    // Lambda Expression
	    Greeting greetObj = (message) -> System.out.println(message);
	    greetObj.greet("Hello Lambda!");
	}

}
