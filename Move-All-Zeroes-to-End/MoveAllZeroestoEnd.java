class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int start=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
    }
}