
public class ExceptionHandlingMultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int[] a = new int[2];
			a[4] = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Error");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Error");
		} catch (Exception e) {
			System.out.println("General Error");
		}
	}
}
