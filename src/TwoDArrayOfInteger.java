//2D array of integer
public class TwoDArrayOfInteger {

	public static void main(String[] args) {
		//Declare and intialize a 2D array
		int [][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		
		};
		
		//Access elements using row and column indices
		System.out.println("Element at [1][2]:"+matrix[1][2]);//Output:6
		
		//Update an element 
		matrix[1][2]=10;
		System.out.println("Updated element at [1][2]:"+matrix[1][2]);//Output:10
		
		//Length of the array (number of rows)
		System.out.println("Number of rows:"+matrix.length);//Output:3
		
		//Length of a specific row (number of columns)
		System.out.println("Number of column in row 0:"+matrix[0].length);//Output:3
		
		//Iterate through the 2D array using nested loops 
		System.out.println("2D Arrayelements");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.println(matrix[i][j]+"");
			}
			System.out.println();//Move to the next linr  after each row
		}
	}

}
