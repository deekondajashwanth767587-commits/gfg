class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int left=0;
        int right =arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==k)return true;
            else if(arr[mid]>k){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
}