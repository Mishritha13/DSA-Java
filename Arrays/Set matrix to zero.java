 /* Brute force
 class Solution {

    public void markRow(int[][] matrix, int row, int n) {
        for (int j = 0; j < n; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    public void markCol(int[][] matrix, int col, int m) {
        for (int i = 0; i < m; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i, n);
                    markCol(matrix, j, m);
                }
            }
        }

        // Convert -1 to 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
} // : time O(m × n × (m + n))    may be n3   space ;O(1)
*/
/* better
    class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        // Mark rows and columns containing 0
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Set cells to 0 based on marks
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
Time Complexity:

O(mn)

Space Complexity:

O(m+n)
for optimal Time Complexity:

O(mn)

Space Complexity:

O(1)
*/  
class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int col0 = 1;

        // Step 1: Mark rows and columns
        for (int i = 0; i < m; i++) {

            if (matrix[i][0] == 0) {
                col0 = 0;
            }

            for (int j = 1; j < n; j++) {

                if (matrix[i][j] == 0) {

                    matrix[i][0] = 0;  // mark row
                    matrix[0][j] = 0;  // mark column
                }
            }
        }

        // Step 2: Fill from back
        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 1; j--) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }

            if (col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }
}
