
public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c;
		int n = 8;
		System.out.println(a + "\n" + b);
		for (int i = 1; i <=n-2; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
 