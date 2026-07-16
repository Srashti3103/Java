
public class MaxMinValue {

	public static void main(String[] args) {
		int[] numbers = {45,12,78,34,89,21};
		int min = numbers[0];
		for(int val : numbers) {
			if(min>val) {
				min = val;
			}
		}
		System.out.println("min "+min);
		min = numbers[0];
		for(int val : numbers) {
			if(min<val) {
				min = val;
			}
		}
		System.out.println("Max "+min);

	}

}
