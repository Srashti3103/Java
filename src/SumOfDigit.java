
public class SumOfDigit {

	public static void main(String[] args) {
		int number =1234;
		int Sum =0;
		while(number != 0) {
			Sum = Sum +  number % 10;
			number = number /10;
		}
		System.out.println("Sum of Digit = "+ Sum);

	}

}
