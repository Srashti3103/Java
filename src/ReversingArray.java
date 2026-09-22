//This example reverse the element =s of an array
public class ReversingArray {

	public static void main(String[] args) {
//		int[]arr = {10,20,30,40,50};
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		int[] numbers = { 1, 2, 3, 4, 5 };
		int[] reversed = new int[numbers.length];
		// Reverse the array
		for (int i = 0; i < numbers.length; i++) {
			reversed[i] = numbers[numbers.length - 1 - i];
		}
		// Print the reversed array
		System.out.println("Reversed array:");
		for (int num : reversed) {
			System.out.print(num + " "); // Output: 5 4 3 2 1
		}
	}

}
