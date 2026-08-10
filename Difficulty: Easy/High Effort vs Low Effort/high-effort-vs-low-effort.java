class Solution {
    public int maxTask(int[] h, int[] l) {
        // code here
        int n  = h.length;
        
        if(n==1){
            return Math.max(0, Math.max(h[0], l[0]));
        }
        int[] dp = new int[n];
        dp[0]=Math.max(h[0] , l[0]);
        dp[1]=Math.max(h[0] + l[1] , h[1]);
        for(int i=2 ;i<n;i++){
            int nothing = dp[i-1];
            int low = dp[i-1]+l[i];
            int high = dp[i-2]+h[i];
            dp[i]=Math.max(nothing  , Math.max(low , high));
        }
        return dp[n-1];
        
    }
}