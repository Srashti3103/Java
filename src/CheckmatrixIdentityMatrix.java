import java.util.Scanner;

public class CheckmatrixIdentityMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Step 1: Take matrix size from user
		System.out.print("Enter the size of the square matrix (n): ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		// Step 2: Input matrix elements
		System.out.println("Enter the elements of the " + n + "x" + n + " matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// Step 3: Assume it's identity until proven otherwise
		boolean isIdentity = true;

		// Step 4: Check identity matrix condition
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && matrix[i][j] != 1) {
					isIdentity = false; // diagonal element not 1
					break;
				} else if (i != j && matrix[i][j] != 0) {
					isIdentity = false; // non-diagonal element not 0
					break;
				}
			}
		}
		// Step 5: Display result
		if (isIdentity)
			System.out.println("膆 The given matrix is an Identity Matrix.");
		else
			System.out.println(" The given matrix is NOT an Identity Matrix.");
		sc.close();
	}

}
