
public class ExponentialSeries {

	public static void main(String[] args) {
		int x = 2;
		int n = 3;
		double sum = 1;
		int fact =1;
		for(int i =1;i<=n;i++) {
			fact = fact * i;
			sum = sum + Math.pow(x, i)/fact;
		}
		System.out.println(sum);
		

	}

}
