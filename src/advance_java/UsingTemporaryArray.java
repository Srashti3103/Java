package advance_java;
import java.util.*;
/*
 * Method 3 - using temporary array
 *  Steps
 *  Copy first k elements
 *  shift remaining elements 
 *  append stored element 
 */
public class UsingTemporaryArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k = 2;
		int n = arr.length;
		int temp[] = new int[k];
		for(int i=0;i<k;i++)
			temp[i]=arr[i];
		for(int i=k;i<n;i++) 
			arr[i-k]=arr[i];
		for(int i=0;i<k;i++)
			arr[n-k+i]=temp[i];
		System.out.println(Arrays.toString(arr));
			
	}
}
