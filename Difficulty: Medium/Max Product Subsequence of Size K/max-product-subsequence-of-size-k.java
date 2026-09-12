class Solution {
    public int maxProduct(int[] arr, int k) {
        // code here
        int n = arr.length;
        long[] maxdp = new long[k+1];
        long[] mindp = new long[k+1];
        for(int j=1;j<=k;j++){
            maxdp[j]=Long.MIN_VALUE;
            mindp[j]= Long.MAX_VALUE;
            
        }
        maxdp[0]=1;
        mindp[0]=1;
        for(int x:arr){
                for (int j = Math.min(k, n); j >= 1; j--) {
            if(maxdp[j-1]==Long.MIN_VALUE){
                continue;
            }
            long product1 = maxdp[j-1]*x;
            long product2 = mindp[j-1]*x;
            long newmax = Math.max(product1  , product2);
            long newmin = Math.min( product1 , product2);
            maxdp[j]= Math.max(maxdp[j] , newmax);
            mindp[j]= Math.min(mindp[j], newmin);
        }
        }
        return (int)maxdp[k];
    }
     
}