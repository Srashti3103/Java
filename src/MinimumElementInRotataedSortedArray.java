
public class MinimumElementInRotataedSortedArray {
	 public static void main(String[] args) {
	        int arr[] = {4, 5, 6, 7, 1, 2,3};

	        int min = findMin(arr);
	        System.out.println("Minimum element: " + min);
	    }
	 static int findMin(int arr[]) {
	        int n = arr.length;
	        if (arr[0] <= arr[n - 1]) {
	            return arr[0];
	        }
	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                return arr[i + 1];
	            }
	        }

	        return arr[0];
	    }
}