
public class CountingOccurencesOfArrayElement {

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 2, 8, 2, 9, 2 };
		int target = 2; // Element to count
		int count = 0;
		for (int num : numbers) {
			if (num == target) {
				count++; // Increment count if the element matches
			}
		}
		System.out.println("Occurrences of " + target + ": " + count); // Output: Occurrences of 2: 4

	}

}
