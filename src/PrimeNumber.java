
public class PrimeNumber {

	public static void main(String[] args) {
		int n=9;
		boolean check = false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				check = true;
				break;
			}
		}
		if(check = false ) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a prime number ");
		}
	}

}
