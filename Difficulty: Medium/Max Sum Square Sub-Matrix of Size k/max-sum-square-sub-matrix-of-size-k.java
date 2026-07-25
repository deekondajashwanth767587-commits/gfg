class Solution {
    public int maximumSum(int[][] mat, int k) {
        // code here
        int n = mat.length;
        int[][] prefix = new int[n][n];
        
        for(int i=0;i<n ;i++){
            for(int j=0;j<n ;j++){
                
                prefix[i][j]=mat[i][j];
                
                if(i>0){
                    prefix[i][j]+=prefix[i-1][j];
                    
                }
                if(j>0){
                    prefix[i][j]+=prefix[i][j-1];
                    
                }
                
                if(i>0 && j>0){
                    prefix[i][j]-=prefix[i-1][j-1];
                }
            }
        }
        int maxsum =Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            for(int j=0;j<=n-k ;j++){
                int r2 = i+k-1;
                int c2 = j+k-1;
                int sum = prefix[r2][c2];
                if(i>0){
                    sum-=prefix[i-1][c2];
                    
                }
                if(j>0){
                    sum-=prefix[r2][j-1];
                    
                }
                if(i>0 && j>0 ){
                    sum+=prefix[i-1][j-1];
                }
                maxsum= Math.max(maxsum , sum);
            }
        }
        return maxsum;
    }
}