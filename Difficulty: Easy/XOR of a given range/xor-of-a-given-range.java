class Solution {
    public int getXor(int[] nums, int a, int b) {
        // Code here
        int ans=0;
        for(int i=a;i<=b;i++){
            ans^=nums[i];
        }
        return ans;
    }
}