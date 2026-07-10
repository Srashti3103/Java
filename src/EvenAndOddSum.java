
public class EvenAndOddSum {

	public static void main(String[] args) {
		int num = 2514795;
		int evensum = 0;
		int oddsum = 0;
		while(num!=0) {
			int digit = num % 10;
			if(digit % 2==0) {
				evensum = evensum + digit;
			}else {
				oddsum = oddsum + digit;
			}
			num = num /10;
		}
		System.out.println(oddsum);
		System.out.println(evensum);
		System.out.println(oddsum*evensum);
		

	}

}
