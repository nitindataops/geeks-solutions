class Solution {
    public int sumExceptFirstLast(int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum-arr[0]-arr[arr.length-1];
    }
}