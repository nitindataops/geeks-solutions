class Solution {
    public void twoDimensional(ArrayList<ArrayList<Integer>> mat) {
        // code here
        int n=mat.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}