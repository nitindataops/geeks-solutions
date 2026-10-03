class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for (int i = 0; i<arr.length; i++) {
            int num=arr[i];
            int rev=0;
            while(num>0){
                int rem=num%10;
                rev=rev*10+rem;
                num/=10;
            }
            if(arr[i]!=rev){
                return false;
            }
        }
        
        return true;
    }
}