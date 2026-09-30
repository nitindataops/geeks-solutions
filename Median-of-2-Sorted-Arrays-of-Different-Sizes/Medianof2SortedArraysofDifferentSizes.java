class Solution {
    public double medianOf2(int a[], int b[]) {
        int [] ans = merge(a, b);
        if (ans.length%2 == 0) {
            double ans2 = (double) (ans[ans.length/2]+ans[ans.length/2 - 1])/2;
            return ans2;
            
        } else {
            double ans2 = (double) (ans[ans.length/2]);
            return ans2;
        }
        
    }
    
public int [] merge(int[] arr1, int[] arr2) {
    int[] ans = new int[arr1.length + arr2.length];
    int p1 = 0; // pointer p1 for array1
    int p2 = 0; // pointer p2 for array2
    int p3 = 0; // pointer p3 for Answer Array
    
    while (p1<arr1.length || p2<arr2.length) {
        int val1 = p1<arr1.length ?arr1[p1]:Integer.MAX_VALUE;
        int val2 = p2<arr2.length ?arr2[p2]:Integer.MAX_VALUE;
        
        if (val1<val2) {
            ans[p3] = val1;
            p1++;
        } else {
            ans[p3] = val2;
            p2++;
        }
        p3++;
    }
    return ans;
    
}
}