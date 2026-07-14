
public class DigitsOfANumber {

	public static void main(String[] args) {
		int num = 12345;
		int digit = 0;
		while(num!=0) {
			digit = num % 10;
			num = num /10;
			System.out.println(digit);
		}

	}

}
