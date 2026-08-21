//Input a matrix from user 
import java.util.Scanner;

public class InputMatrixFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 3, cols=3;
		int[][] matrix = new int[rows][cols];
		System.out.println("Enter matrix elements ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		
		//Display matrix
		System.out.println("Matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println(matrix[i][j]+"");
			}
			System.out.println();
		}

	}

}
