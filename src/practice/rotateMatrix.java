package practice;
/*
 * Rotate a given square matrix by 90 degrees.
 * For simplicity, I'm assuming all inputs are square.
 * 
 */
public class rotateMatrix {

	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0; i<n/2; i++) {
			int first = i;
			int last = n-1-i;
			for(int j=0; j<matrix[0].length; j++) {
				int off = j-first;
				int top = matrix[first][j];
				
				matrix[first][j] = matrix[last-off][first];
				matrix[last-off][first] = matrix[last][last-off];
				matrix[last][last-off] = matrix[j][last];
				matrix[j][last] = top;

			}
		}
		
		
	}
}
