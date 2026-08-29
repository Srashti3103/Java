
//Intialization of 2D array ---->>>> Syntax
/*
 * dataType[][] arrayName = {
 {value1, value2, value3},
 {value4, value5, value6},
 {value7, value8, value9}
};
 */
public class MultiDimensionArray {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(matrix[1][0]);
		matrix[2][0] = 100;
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("************************");
		for (int[] a : matrix) {
			for (int val : a) {
				System.out.println(val + " ");
			}
			System.out.println();
		}
		int m[][] = new int[4][3];
		int m1[][] = new int[3][];
		m1[0] = new int[3];
		m1[1] = new int[5];
		m1[2] = new int[3];
		m1[0][0] = 1;
		m1[0][0] = 2;
		m1[0][0] = 3;
		m1[1][0] = 1;
		m1[1][1] = 1;
		m1[1][0] = 1;
		System.out.println("***************");
		for (int[] a : m1) {
			for (int val : a) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
