import java.util.*;

public class BestCombinedCodeHandleAllEdgeCases {
	static void rotate(int arr[], int k) {
		if (arr.length == 0) {
			System.out.println("Empty array");
			return;
		}
		if (arr.length == 1) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		if (k == 0) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
		reverse(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));
	}

	static void reverse(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}


	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		rotate(arr, 8);
	}
}