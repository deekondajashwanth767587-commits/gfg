class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        if(x<arr[0])return -1;
        int left =0;
        int right =arr.length-1;
        while(right>left){
            int mid = (left+right+1)/2;
            if(arr[mid]<=x){
                left=mid;
            }else{
                right=mid-1;
            }
            
        }
        return left;
    }
}
