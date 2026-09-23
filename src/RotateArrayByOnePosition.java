/*
 * Method -1 ---- Rotate Array by one position 
 * Algorithm 
 * Step -1 : Store first element 
 * Step -2 : Shift elements left
 * Step -3 : Put first element at end 
 * 
 */
public class RotateArrayByOnePosition {

	public static void main(String[] args) {
		int []arr =  {10,20,30,40,50};
		int first = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = first;
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}

