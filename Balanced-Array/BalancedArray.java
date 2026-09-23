class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        
        int leftsum=0;
        int rightsum=0;
        int n=arr.size();
        for(int i=0;i<n/2;i++){
            leftsum +=arr.get(i);
        }
        for(int i=n/2;i<n;i++){
            rightsum+=arr.get(i);
        }
        return Math.abs(leftsum-rightsum);
        
    }
};