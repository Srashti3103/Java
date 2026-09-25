
public class SeriesFor1 {

	public static void main(String[] args) {
		int x=2,n=4;
		double sum =1;
		System.out.println("Enter base (x):"+x);
		System.out.println("Enter exponent limit (n):"+n);
		System.out.print("Series:1");
		for(int i=1;i<=n;i++) {
			double term = Math.pow(-1, i)*Math.pow(x, i);
			sum =sum +term;
			if(term < 0) {
				System.out.print("-"+x+"^"+i);
			}else {
				System.out.print("+"+x+"^"+i);
			}
		}
		System.out.println();
		System.out.println("Sum of series ="+sum);

	}

}
