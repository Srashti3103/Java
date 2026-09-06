
public class PrintSeriesAndSum {

	public static void main(String[] args) {
		int x = 2, n = 3;
		double sum = 1;
		System.out.println("Enter base (x) : " + x);
		System.out.println("Enter exponent limit (n): " + n);
		System.out.print("Series : 1");
		for (int i = 1; i <= n; i++) {
			sum = sum + Math.pow(x, i);
			System.out.print(" + "+x+"^"+i);
		}
		System.out.println();
		System.out.println("Sum of Series = " + sum);

	}

}
