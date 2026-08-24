
public class Methods {

	public void greet() {
		System.out.println("Hello, World");
	}

	public void printSum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum : " + sum);
		a = 100;
		b = 200;

	}

	public double p(int a, int b) {
		return Math.pow(a, b);
	}

	public int getRandomNumber() {
		return (int) (Math.random() * 100);// Returns a random number between 0 to 1

	}

	public int multiply(int a, int b) {
		return a * b;// Return the product of a and b
	}
	public boolean t() {
		return true;
	}
	
	public String a() {
		return "abc";
	}
	public Employee x() {
		Employee e = new Employee();
		return e;
	}
	void t1 (boolean  i) {}//t1 true
	void t2 (float i) {}//t2(5.5f)
	void t3(String s ) {}//t3 ("abc")
	void t4(Employee e) {};
	
	public static int square(int num) {
		return num * num;
	}
	
	static {
		//static block
		//Automatically call  jaise hee class  memory mai aayi 
		//Ststic block --- first comes in memory ,before main
		
		int k1=5;
		System.out.println(k1);
	}
	
	public int sum (int... numbers) {//10,20,30
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(Methods.square(10));//Static method 
		//for accessing static var/method , do not create an object , direct access
		//classname.staticvar or staticmethods
		Methods obj = new Methods();
		System.out.println(obj.sum(10,20,30));
		System.out.println(obj.sum(10,20));
		System.out.println(obj.sum(10,20,30,40));
		System.out.println(obj.sum());
		//always create an object for accessing instance var/method 
		obj.greet();//Employee e = new Employee(); t4
		int a = 10;
		int b = 5;
		obj.printSum(a, b);// call ----> execute
		System.out.println(a);// 10
		System.out.println(b);// 5
		System.out.println(obj.p(3, 4));
		double p1 = obj.p(a, b);
		System.out.println(p1);
		System.out.println(Math.random() * 100);// 0 to 1
		System.out.println((int) (Math.random()) * 100);// 0 to 1
		System.out.println((int) (Math.random() * 100));// 0 to 1

		System.out.println(obj.getRandomNumber());
		System.out.println(obj.multiply(3, 4));
	}

}
