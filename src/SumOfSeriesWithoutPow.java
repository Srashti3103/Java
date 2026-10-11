
public class SumOfSeriesWithoutPow {

	public static void main(String[] args) {
		int x = 2,n = 3;
		int power =1, sum = 1;
		System.out.println("Enter base (x) : "+x);
		System.out.println("Enter exponent limit (n): "+n);
		for(int i=1;i<=n;i++) {
			power = power * x;
			sum=sum+power;
		}
		System.out.println("Sum of Series = "+sum);

	}

}
