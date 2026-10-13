//A 3D array is an array of 2D arrays . It can be visualized as a cube with layers , rows, and columns.

public class ThreeDArrray {

	public static void main(String[] args) {
		//Declare and intialize a 3D array
		int[][][] cube = {
				{
					{1,2,3},
					{4,5,6}
				},
				{
					{7,8,9},
					{10,11,12}
				}
		};
		
		//Access elements using three indices
		System.out.println("Element at [1][1][2]:"+cube[1][1][2]);//Output : 12
		
		//Iterate through the 3D array using nested loops 
		System.out.println("3D Array elements:");
		for(int i=0;i<cube.length;i++) {
			for(int j=0;j<cube[i].length;j++) {
				for(int k=0;k<cube[i][j].length;k++) {
					System.out.println(cube[i][j][k]+" ");
					
				}
				System.out.println();//move to the next line after each row
			}
			System.out.println();//Add a blank line between layers
		}
	}

}
