import java.util.Scanner;

public class CheckMatrixSymmetric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Step 1: Input matrix size
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		// Step 2: Input matrix elements
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// Step 3: Check if it's a square matrix
		if (rows != cols) {
			System.out.println(" Not a square matrix — Symmetry check not possible!");
			return;
		}
		// Step 4: Check for symmetry
		boolean isSymmetric = true;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					isSymmetric = false;
					break;
				}
			}
		}
		// Step 5: Display result
		if (isSymmetric)
			System.out.println("膆 The given matrix is Symmetric.");
		else
			System.out.println(" The given matrix is NOT Symmetric.");
		sc.close();
	}

}
