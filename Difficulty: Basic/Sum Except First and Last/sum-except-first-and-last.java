class Solution {
    public int sumExceptFirstLast(int[] arr) {
        // code here
        int result =0;
        for(int i=1;i<arr.length-1;i++){
            result+=arr[i];
        }
        return result;
    }
}