
public class FrequencyOfDigit {

	public static void main(String[] args) {
		int num = 223422;
		int target = 2;
		int count = 0;
		while(num !=0) {
			if(num % 10 == target) {
				count++;
			}
			num = num / 10;
		}
		System.out.println("Frequency of "+target+":"+count);
	}

}
