class Solution {
    int minRow(int mat[][]) {
        // code here
        int min=Integer.MAX_VALUE;
        int n=mat.length;
        int m=mat[0].length;
        int index=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count<min){
                min=count;
                index=i;
            }
        }
        return index+1;
    }
}