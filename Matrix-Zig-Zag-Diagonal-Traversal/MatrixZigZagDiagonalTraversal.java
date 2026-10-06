class Solution {
    public List<Integer> matrixDiagonally(int[][] mat) {
        // code here
        int n=mat.length;
        List<Integer> res=new ArrayList<>();
        res.add(mat[0][0]);
        int row=0;
        int col=1;
        while(res.size()<n*n){
            while(col>=0 && col<n && row>=0 && row<n){
                res.add(mat[row][col]);
                row++;
                col--;
            }
            if(row<n){
                col=0;
            }else{
                col+=2;
                row=n-1;
            }
            while(col>=0 && col<n && row>=0 && row<n){
                res.add(mat[row][col]);
                row--;
                col++;
            }
            if(col<n){
                row=0;
            }else{
                row+=2;
                col=n-1;
            }
        }
        return res;
    }
}