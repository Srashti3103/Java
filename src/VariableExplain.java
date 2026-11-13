import java.io.Serializable;

public class VariableExplain {
	// To explain variables in java
	// 1. Local Variable
	public void displayLocal() {
		int localVar = 10;
		System.out.println("Local Variable: " + localVar);
	}

	// 2. Instance Variable
	static class Student {
		private String name;
		private int age;

		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public void display() {
			System.out.println("Instance Variables -> Name: " + name + ", Age: " + age);
		}
	}

	// 3. Static Variable
	static class Counter {
		static int count = 0;

		public Counter() {
			count++;
		}

		public void displayCount() {
			System.out.println("Static Variable Count: " + count);
		}
	}

	// Parameter Variable Example
	public void greet(String name) {
		System.out.println("Hello, " + name);
	}

	// 4. Final Variable
	static class Circle {
		final double PI = 3.14159;
		final static int MAX_RADIUS = 100;

		public void calculateArea(double radius) {
			final double area = PI * radius * radius;
			System.out.println("Final Variable Area: " + area);
		}
	}

	// 5. Transient Variable
	static class User implements Serializable {
		private static final long serialVersionUID = 1L;

		private String username;
		private transient String password;

		public User(String username, String password) {
			this.username = username;
			this.password = password;
		}

		public void displayUser() {
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
		}
	}

	// 6. Volatile Variable
	static class SharedResource {

		private volatile boolean flag = false;

		public void toggleFlag() {
			flag = !flag;
		}

		public boolean isFlag() {
			return flag;
		}
	}

	// Main Method
	public static void main(String[] args) {

		VariableExplain obj = new VariableExplain();

		// Local Variable
		obj.displayLocal();

		// Parameter and Argument
		obj.greet("Srashti");

		// Instance Variable
		Student s1 = new Student("Srashti", 19);
		s1.display();

		// Static Variable
		Counter c1 = new Counter();
		Counter c2 = new Counter();

		c1.displayCount();

		// Final Variable
		Circle circle = new Circle();
		circle.calculateArea(5);

		// Transient Variable
		User user = new User("Srashti123", "mypassword");
		user.displayUser();

		// Volatile Variable
		SharedResource resource = new SharedResource();

		System.out.println("Initial Flag: " + resource.isFlag());

		resource.toggleFlag();

		System.out.println("Updated Flag: " + resource.isFlag());
	}
}