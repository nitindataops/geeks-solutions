class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        ArrayList<Integer> ans=new ArrayList<>();
        int upperSum=0;
        int lowerSum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i<=j){
                    upperSum+=mat[i][j];
                }
                if(j<=i){
                    lowerSum+=mat[i][j];
                }
            }
        }
        ans.add(upperSum);
        ans.add(lowerSum);
        return ans;
    }
}