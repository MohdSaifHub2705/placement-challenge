class Solution {
    public void rotate(int[][] matrix) {
        // there are two steps to follow of rotate the matrix
        // step 1 transpose the matrix | transpose means = row change column
        // and column change by row

        // step 2 reverse the matrix row

        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        } 

        // step 2 follow reverse

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }        
    }
}
