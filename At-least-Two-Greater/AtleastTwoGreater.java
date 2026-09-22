class Solution {
    public long[] findElements(long arr[]) {
        // code here
       Arrays.sort(arr);
       return Arrays.copyOf(arr,arr.length-2);
    }
}