class Solution {
    public int maxZeros(int[][] arr) {
        // code here
        int n=arr.length;
        int maxcount=0;
        int ans=-1;
        for(int col=0;col<n;col++){
            int count=0;
            for(int row=0;row<arr.length;row++){
                if(arr[row][col]==0){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                ans=col;
            }
        }
        return ans;
    }
}