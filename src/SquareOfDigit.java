
public class SquareOfDigit {

	public static void main(String[] args) {
		int num = 123;
		int original = num ;
		int length = 0;
		while(num != 0) {
			num = num /10;
			length ++;
		}
		for(int i=length-1;i>=0;i--) {
			int digit = (int)(original % Math.pow(10, i));
			original =(int)(original / Math.pow(10, i));
			System.out.println(original*original);
			original = digit;
			}
	}

}
