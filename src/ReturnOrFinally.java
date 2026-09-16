/*
 * Even though return  statement  present  in try or catch block first finally will be executed and after that only return statement will be considered i.e finally block dominates return statement.
 */
public class ReturnOrFinally {
	public static void main(String[] args) {

		try {
			System.out.println("try block executed");
			return;
		} catch (ArithmeticException e) {
			System.out.println("Catch block executed");
		} finally {
			System.out.println("Finally block executed");

		}
	}
}
