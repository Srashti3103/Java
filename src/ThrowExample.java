
public class ThrowExample {
	public static void main(String[] args) {
		int age = 15;
		if(age<18) {
			throw new ArithmeticException("Access denied-You must be 18 or older.");
		}
		System.out.println("Access granted - You are old  enough!");
	}
}
 