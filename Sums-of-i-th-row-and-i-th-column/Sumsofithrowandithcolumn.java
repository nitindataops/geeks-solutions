class Solution {
    public boolean sumOfRowCol(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int limit=Math.min(n,m);
        for(int i=0;i<limit;i++){
            int rowSum=0, colSum=0;
            for(int j=0;j<m;j++){
                rowSum+=mat[i][j];
            }
            for(int j=0;j<n;j++){
                colSum+=mat[j][i];
            }
            if(rowSum!=colSum){
                return false;
            }
        }
        return true;
    }
}