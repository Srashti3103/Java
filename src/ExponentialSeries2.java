
public class ExponentialSeries2 {

	public static void main(String[] args) {
		int x=2;
		int n=4;
		double sum =1;
		int fact = 1;
		System.out.println("Enter base (x):"+x);
		System.out.println("Enter number of terms (n):"+n);
		System.out.print("Series:1");
		for(int i=1;i<=n;i++) {
			fact = fact * i;
			double term = ((Math.pow(-1,i))*(Math.pow(x, i)))/fact;
			sum = sum + term;
			if(term<0) {
				System.out.print("-("+x+"^"+i+")/"+i+"!");
			}else {
				System.out.print("+("+x+"^"+i+")/"+i+"!");
			}
		}
		System.out.println();
		System.out.println("Sum of Series = "+sum);

	}

}
