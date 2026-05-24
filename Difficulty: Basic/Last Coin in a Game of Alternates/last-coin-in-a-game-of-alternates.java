class Solution {
    public int coin(int[] arr) {
        // code here
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]>=arr[right]){
                left++;
            }else if(arr[right]>=arr[left]){
                right--;
            }
        }
        return arr[left];
    }
}