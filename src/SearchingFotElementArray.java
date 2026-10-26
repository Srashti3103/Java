//Searching for an Element in an array
//this exampple demonstrates how to search for a specific element iin an array.

public class SearchingFotElementArray {

	public static void main(String[] args) {
		
//		int[] arr = { 10, 20, 30, 40, 50 };
//		int key = 40;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == key) {
//				System.out.println("Serached number :" + arr[i] + " is index " + i);
//			}
//		}
		 
		int[] numbers = { 5, 12, 9, 3, 7 };
		int target = 9;// Element to search for
		boolean found = false;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				System.out.println("Element found at index :" + i);// Output :Element found at index : 2
				found = true;
				break; // Exit the loop once the element is found
			}
		}
		if (!found) {
			System.out.println("Element not found in the array.");
		}
	}

}
