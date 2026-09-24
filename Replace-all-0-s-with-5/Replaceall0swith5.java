class Solution {
    public int convertFive(int n) {
        // code here
        if (n == 0) {
            return 5;
        }
        int result = 0;
        int multipiler = 1;
        while (n>0) {
            int digit = n%10;
            if (digit == 0) {
                digit = 5;
            }
            result += digit*multipiler;
            multipiler *= 10;
            n /= 10;
        }
        return result;
    }
}