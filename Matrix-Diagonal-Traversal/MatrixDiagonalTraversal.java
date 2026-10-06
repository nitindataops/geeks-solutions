class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        res.add(mat[0][0]);
        int n=mat.length;
        int row=0;
        int col=1;
        int row_S=0;
        int col_S=1;
        while(res.size()<n*n){
            if(col<n){
                row=row_S;
                col=col_S;
                col_S++;
            }else{
                col=n-1;
                row_S++;
                row=row_S;
            }
            while(col>=0 && col<n && row>=0 && row<n){
                res.add(mat[row][col]);
                row++;
                col--;
            }
        }
        return res;
    }
}