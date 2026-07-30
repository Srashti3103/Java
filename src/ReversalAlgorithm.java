/*
 * Most important interview mwthod 
 * Idea 
 * Rotate  left by d 
 * Steps:
 * 1. Reverse first  d elements
 * 2. Reverse remaining elements
 * 3. Reverse whole array
 */

import java.util.Arrays;

public class ReversalAlgorithm {
	static void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp= arr[start];
			arr[start]=arr[end];
			arr[end]= temp;
			start++;
			end--;
			
		}
	}

	static void rotate(int arr[], int k) {
		int n = arr.length;
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
	}
	public static void main(String[] args) {
		int arr[] =  { 1,2,3,4,5,6,7};
		rotate(arr,2);
		System.out.println(Arrays.toString(arr));
	}
}
