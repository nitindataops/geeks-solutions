class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int n = mat.length;
        int m = mat[0].length;
        int [] ans = new int [n];
        for (int i = 0; i<n; i++) {
            int sum = 0;
            for (int j = 0; j<m; j++) {
                sum += mat[i][j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}