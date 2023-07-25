class Solution {

    // steps first calculate the ncr of row and column
    public static int nCr(int n, int r) {
      long result = 1;
    //   calculate ncr 
    for(int i=0; i < r; i++) {
        // where r = c-1  & n = r-1
        result = result *(n-i);
        result = result / (i+1);
    }
    return (int) result;

 }
    public List<List<Integer>> generate(int numRows) {
       
       List<List<Integer>> ans = new ArrayList<>();

    // store the entire pascals triangle
    for(int row = 1; row <= n; row++) {
        List<Integer> temp = new ArrayList<>();
        for(int column = 1; column <= row; column++) {
            temp.add(nCr(row-1, column-1));
        }
        ans.add(temp);
    }
    return ans;
        
    }
}
