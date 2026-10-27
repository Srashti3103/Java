import java.util.Arrays;

public class RotateArrayByLeftWhereHandleSingleElement {
	static void reverse(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void rotate(int arr[], int k) {
		if(arr.length<=1) {
			return;
		}
		if (k == 0) {
			return;
		}
		int n = arr.length;
		if (n == 0) {
			System.out.println("Array is empty");
			return;
		}
		k = k % n;
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
		reverse(arr, 0, n - 1);
	}

	public static void main(String[] args) {
		int arr[] = {};
		// int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 12);
		System.out.println(Arrays.toString(arr));
	}
}
