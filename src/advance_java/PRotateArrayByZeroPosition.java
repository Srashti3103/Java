package advance_java;

import java.util.*;

public class PRotateArrayByZeroPosition {
	static void rotate(int arr[], int k) {
		if (k == 0)
			return;
		int n = arr.length;
		k = k % n;
		int temp = arr[0];
		for (int i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[n - 1] = temp;
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
		int k = 10 ;
		rotate(arr, k);
		System.out.println(Arrays.toString(arr));
	}
}