import java.util.Arrays;

public class Removing_DuplicatesArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 2, 4, 5, 1 };
		int[] unique = new int[numbers.length];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < index; j++) {
				if (numbers[i] == unique[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				unique[index++] = numbers[i]; // Add to unique array if not a duplicate
			}
		}
		// Resize the unique array to remove unused slots
		unique = Arrays.copyOf(unique, index);
		// Print the unique array
		System.out.println("Array without duplicates:");
		for (int num : unique) {
			System.out.print(num + " "); // Output: 1 2 3 4 5
		}

	}

}
