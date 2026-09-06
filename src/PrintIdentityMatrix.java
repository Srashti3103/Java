//Print identity matrix 
public class PrintIdentityMatrix {

	public static void main(String[] args) {
		int n = 4;// Size of the matrix (4x4)
		int[][] matrix = new int[n][n];// create 2D array

		// Create identity matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					matrix[i][j] = 1;// diagonal elements are 1

				} else {
					matrix[i][j] = 0;// all other elements are 0
				}
			}
		}

		// Print the identity matrix
		System.out.println("Identity matrix of size " + n + "X" + n + ":\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();// move to next line after each row
		}
      
	}

}
