
public class MergingTwoArray {

	public static void main(String[] args) {
//		int []arr1= {10,30,50,70};
//		int []arr2= {20,40,60,80};
//		int []mergedarr = new int[arr1.length+arr2.length];
//		int j=0;
//		for(int i=0;i<arr1.length;i++) {
//			mergedarr[j++] = arr1[i];
//			mergedarr[j++] = arr2[i];
//		}
//		for(int val:mergedarr) {
//			System.out.println(val);
//		}
		
		int[] array1 = {1, 2, 3};
		 int[] array2 = {4, 5, 6};
		 int[] merged = new int[array1.length + array2.length];
		 // Copy elements from array1 to merged
		 for (int i = 0; i < array1.length; i++) {
		 merged[i] = array1[i];
		 }
		 // Copy elements from array2 to merged
		 for (int i = 0; i < array2.length; i++) {
		 merged[array1.length + i] = array2[i];
		 }
		 // Print the merged array
		 System.out.println("Merged array:");
		 for (int num : merged) {
		 System.out.print(num + " "); // Output: 1 2 3 4 5 6
		 }
	
	}

}
