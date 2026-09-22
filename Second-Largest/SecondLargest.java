class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int large=-1;
        int secondlarge=-1;
        for(int num:arr){
            if(num>large){
                secondlarge=large;
                large=num;
            }else if(num>secondlarge && num!=large){
                secondlarge=num;
            }
        }
        return secondlarge;
    }
}