package advance_java;
/*
 * Method 4 - Reversal algorithm (Best for interviews and coding test )
 * Most important interview method 
 * Idea 
 * Rotate left by d
 * Steps:
 * 1 Reverse first d elements
 * 2 Reverse remaining elements
 * 3 Reverse whole array
 * 
 */
import java.util.*;

public class ReversalAlgorithm {
	static void reverse (int arr[] , int start, int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void rotate(int arr[] , int d) {
		int n = arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		rotate(arr,2);
		System.out.println(Arrays.toString(arr));
	}
}
