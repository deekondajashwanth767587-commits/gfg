class Solution {
    public int findSmallest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int reach =0;
        for(int num:arr){
            if(num>reach+1){
                return reach+1;
            }
            reach+=num;
        }
        return reach+1;
    }
}