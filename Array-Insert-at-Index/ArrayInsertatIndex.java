import java.util.*;
class Solution {
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        if(index>=0 && index<=arr.size()){
            arr.add(index,val);
        }
    }
}