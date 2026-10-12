
public class ThrowsExample2 {
	static void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Underage not allowed");
		}
		System.out.println("Age accepted");
	}

	public static void main(String[] args) {
		try {
			checkAge(15 );
		} catch (Exception e) {
			System.out.println("Caught: " + e.getMessage());
		}

	}
}
