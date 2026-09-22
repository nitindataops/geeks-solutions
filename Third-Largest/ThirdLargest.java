class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        int large=-1;
        int second=-1;
        int third=-1;
        for(int num:arr){
            if(num>large){
                third=second;
                second=large;
                large=num;
            }else if(num>second){
                third=second;
                second=num;
            }else if(num>third){
                third=num;
            }
        }
        return third;
    }
}