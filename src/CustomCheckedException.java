class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomCheckedException {
	static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age less than 18 is not allowed.");
		}
		System.out.println("Age is valid.");
	}

	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (InvalidAgeException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
