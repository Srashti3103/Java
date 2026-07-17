/*
		 * constructor is mode to intialize the object Basic syntax of a java class:
		 * <modifier>class<name>{ <attribute_declaration>* <constructor_declaration>*
		 * <method_declaration>* }
		 * 
		 * Basic syntax of a constructor: <modifier><class_name>(<parameter>*){
		 * <statment>*}
		 * 
		 * Basic syntax of a java class: <madifier>class<name>{ <attribute_declaration>*
		 * <constructor_declaration>* <method_declaration>* }
		 * 
		 * constructor ka naam or class ka naam same hota hai
		 * 
		 * constructor ka koi return type nhi hota hai void bhi nhi or agr return type lga diya toh
		 * koi error nhi aayegi voh ek method maan lii jayegi
		 * 
		 * more than one constructor is identified by there parameter
		 * 
		 * There is always at least one constructor in every class if the writer doesnot 
		 * ssupply any constructors , the compiler generates a default constructor
		 * automatically . The default constructor takes no arguments
		 * 
		 * Enables you to create object instances with new vehicle() without having to
		 * write a constructor
		 * 
		 * vehicle obj = new vehicle();//Default constructor
		 * 
		 * 
		 */
public class Employee {

	String employeeName;
	String employeeEmail;

	public Employee() {// Constructor
		employeeName = "sam";
		employeeEmail = "ss@ss.com";
	}

	public Employee(String n, String e) {
		employeeName = n;
		employeeEmail = e;
	}

	public void getDisplay() {
		System.out.println("Name of an employee :" + employeeName);
		System.out.println("Name of an employee :" + employeeEmail);
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.getDisplay();

		Employee e2 = new Employee();
		e2.getDisplay();

		Employee e3 = new Employee("pp", "pp@pp.com");
		e3.getDisplay();
		/*
		 * Key features of constructors Name : the constructor must have the same name
		 * as the class no return type : constructors do not have a return type , not
		 * even void. A constructor automatically called when the object is created It
		 * is primarily used to intialize the state (attributes) of an object . You can
		 * have multiple constructors in a class (constructor overloading ), each with
		 * different parameters.
		 * 
		 */

		int i = 10;
		Integer j = 10;

	}
}
