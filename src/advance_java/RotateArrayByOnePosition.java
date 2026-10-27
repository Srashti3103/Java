package advance_java;
/*
 * Rotate Array by One Position 
 * Algorithm 
 * Step 1: Store first element 
 * Step 2: Sift elements left
 * Step 3: Put first element at end 
 */
public class RotateArrayByOnePosition {
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int first = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=first;
		for(int i:arr)
			System.out.println(i+" ");
	}
	
}
