
public class SumOfSeries {

	public static void main(String[] args) {
		int x = 2,n = 3;
		double sum = 1;
		System.out.println("Enter base (x) : "+x);
		System.out.println("Enter exponent limit (n): "+n);
		for(int i=2;i<=n;i++) {
			sum=sum+Math.pow(x, i);
		}
		System.out.println("Sum of Series = "+sum);

	}

}
