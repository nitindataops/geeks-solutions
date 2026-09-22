class Solution {
    public void segregateElements(int[] arr) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }else{
                pos.add(arr[i]);
            }
        }
        int start=0;
        for(int i=0;i<pos.size();i++){
            arr[start]=pos.get(i);
            start++;
        }
        for(int i=0;i<neg.size();i++){
            arr[start]=neg.get(i);
            start++;
        }
    }
}