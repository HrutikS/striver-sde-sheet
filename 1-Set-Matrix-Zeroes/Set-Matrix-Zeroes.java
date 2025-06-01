class Solution {
  
    public void setZeroes(int[][] matrix) {
        
        // get m & n
        int m = matrix.length;
        int n = matrix[0].length;

        // initialize 2 arrays for storing locations of 0s
        int[] rowz = new int[m];
        int[] colz = new int[n];

        // 1st Traversal to find locations of 0s
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matrix[i][j] == 0) {
                    rowz[i] = 1;
                    colz[j] = 1;
                }
            }
        }

        // 2nd Traversal to insert 0s in rows & columns of marked locations
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (rowz[i] == 1 || colz[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
