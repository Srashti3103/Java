// Encapsulated class 
class Employee1 {
// Private variables (data hiding) 
	private String name;
	private int age;
	private double salary;

// Public getter for name 
	public String getName() {
		return name;
	}

// Public setter for name 
	public void setName(String name) {
		this.name = name;
	}

// Public getter for age 
	public int getAge() {
		return age;
	}

//Public setter for age with validation 
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Invalid age. Age must be greater than 0.");
		}
	}

// Public getter for salary 
	public double getSalary() {
		return salary;
	}

// Public setter for salary with validation 
	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary. Salary must be greater than 0.");
		}
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// Create an object of the Employee class
		Employee1 emp = new Employee1();

		// Set values using setter methods
		emp.setName("John Doe");
		emp.setAge(30);
		emp.setSalary(50000);

		// Get values using getter methods
		System.out.println("Name: " + emp.getName());
		System.out.println("Age: " + emp.getAge());
		System.out.println("Salary: " + emp.getSalary());

		// Try to set invalid values
		emp.setAge(-5); // Invalid age
		emp.setSalary(-1000); // Invalid salary

	}

}
