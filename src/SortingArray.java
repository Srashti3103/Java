import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int[] numbers= {5,2,9,1,5,6};
		
		//sort the array 
		 Arrays.sort(numbers);
		 
		 //Print the sorted array
		 System.out.println("Sorted array:");
		 for(int num: numbers) {
			 System.out.println(num+" ");//output:1 2 5 5 6 9 
		 }

	}

}
