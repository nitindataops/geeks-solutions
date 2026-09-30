class Solution {
    public int countZeros(int[][] mat) {
        // code here
        int n=mat.length;
        int row=n-1;
        int col=0;
        int count=0;
        while(row>=0 && col<n){
            if(mat[row][col]==0){
                count+=row+1;
                col++;
            }else{
                row--;
            }
            
        }
        return count;
    }
};