//A jagged array is a 2D array where each row can have a different number of columns.
public class JaggedArray {

	public static void main(String[] args) {
		//Declare andintialize a jagged array 
		int[][] jaggedArray = {
				{1,2,3},{4,5},{6,7,8,9}
		};
		
		//Iterate through the jagged array 
		System.out.println("Jagged array elements:");
		for(int i=0;i<jaggedArray.length;i++) {
			for(int j=0;j<jaggedArray[i].length;j++) {
				System.out.print(jaggedArray[i][j]+"");
			}
			System.out.println();//Move to the next line after each row
		}
	}

}
