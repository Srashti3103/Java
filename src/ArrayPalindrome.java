//This example checks if an array is a palindrome (reads the same backward as forward).
public class ArrayPalindrome {

	public static void main(String[] args) {
		int[]  numbers = {1,2,3,2,1};
		boolean isPalindrome = true;
		for(int i=0;i<numbers.length/2;i++) {
			if(numbers[i]!=numbers[numbers.length-1-i]) {
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("The array is a palindrome");
		}else {
			System.out.println("The array is not a palindrome");
		}

}
}
