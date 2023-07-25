class Solution {
    public void setZeroes(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;
       boolean row = false;
       boolean col = false;
    
    //    check col
       for(int i=0; i<n; i++) {
           if(matrix[i][0] == 0) {
               col = true;
               break;
           }
       }
    //    check row
       for(int j=0; j<m; j++) {
           if(matrix[0][j] == 0) {
               row = true;
               break;
           }
       }
    //   both check row and col
       for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               if(matrix[i][j] == 0) {
                   matrix[0][j] = 0;
                   matrix[i][0] = 0;
               }
           }
       }
    //    col check then row
       for(int i=1; i<n; i++) {
           if(matrix[i][0] == 0) {
               for(int j=1; j<m; j++) {
                   matrix[i][j] = 0;
               }
           }
       }
    //    row check then col
       for(int j=1; j<m; j++) {
           if(matrix[0][j] == 0) {
               for(int i=1; i<n; i++) {
                   matrix[i][j] = 0;
               }
           }
       }
    //    true tab
       if(col) {
           cleanZeroCol(matrix, n);
       }
    //    true tab
       if(row) {
           cleanZeroRow(matrix, m);
       }
    }
    public void cleanZeroCol(int[][] matrix, int n) {
        for(int i=0; i<n; i++) {
            matrix[i][0] = 0;
        }
    }
    public void cleanZeroRow(int[][] matrix, int m) {
        for(int j=0; j<m; j++) {
            matrix[0][j] = 0;
        }
    }
}
