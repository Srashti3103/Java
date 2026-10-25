package advance_java;

public class RightRotationByReversalAlgorithm {
	static void reverse(int arr[], int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void rotate(int arr[],int k) {
		int n = arr.length;
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
	}
}
