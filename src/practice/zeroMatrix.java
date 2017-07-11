package practice;
/*
 * Search matrix for a zero; if found, make the row/col containing that zero
 * all zeros
 * 
 * Space complexity of this solution is not optimal. 
 * Faster solution is to only change first row an col. If the inner rows/cols
 * contain zeros, change the corresponding index in row/col one to zero. 
 * Save flags to change first row and col to zeros if they contained zeros to begin with,
 * then change the first row/col to zeros last.
 */
public class zeroMatrix {
	
	public static void checkZeros(int[][] matrix) {
		int[][] zeroLocations = new int[matrix.length][matrix.length];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				if(matrix[i][j]==0) {
					zeroLocations[i][j]++;
				}
			}
		}
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				if(zeroLocations[i][j]==1) {
					zeroRow(matrix, i);
					zeroCol(matrix, j);
				}
			}
		}
		
	}
	
	public static void zeroRow(int[][] matrix, int row) {
		for(int i=0; i<matrix.length; i++) {
			matrix[row][i] = 0;
		}
	}
	
	public static void zeroCol(int[][] matrix, int col) {
		for(int i=0; i<matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}
}
