/*
 * Method 2 -- Rotate by K positions (Brute Force)
 * Brute Force : Rotate the array one position at a time and  repeat the process k times until the required  rotation is achieved
 * 
 * Rotate k times using rotate-by-one logic
 */
public class RotateByKPositionsBruteForce {
	static void rotate(int arr[],int k) {
		int n = arr.length;
		for(int j=0;j<k;j++) {
			int first = arr[0];
			for(int i=0;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[n-1]= first;
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		rotate(arr,3);
		for(int i:arr) {
			System.out.println(i);
		}
	}
}