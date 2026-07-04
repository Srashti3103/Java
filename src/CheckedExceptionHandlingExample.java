
public class CheckedExceptionHandlingExample {
	public static void main(String[] args) {
		int i = 0;
		String greetings[] = { "Hello", "hii", "Bye" };
		try {
			while (i <= greetings.length) {
				System.out.println(greetings[i]);
				i++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("All records Displayed.");

	}
}
