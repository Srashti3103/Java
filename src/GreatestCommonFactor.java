
public class GreatestCommonFactor {

	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 18;
		int gcd = 1;
		System.out.println("Enter two integers: " + n1 + "," + n2);
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("G.C.D of " + n1 + " and " + n2 + " is " + gcd);
		 
	}

}
