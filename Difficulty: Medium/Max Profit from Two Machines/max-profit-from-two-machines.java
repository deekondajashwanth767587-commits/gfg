class Solution {
    public int maxProfit(int x, int y, int[] a, int[] b) {
        // code here
        int profit =0;
        int n = a.length;
        Integer[] idx = new Integer[n];
        for(int i=0;i<n ; i++){
            idx[i]=i;
            
        }
        java.util.Arrays.sort(idx,  (i,j)->Math.abs(b[j]-a[j])-Math.abs(b[i]-a[i]));
        for(int i:idx){
            if((a[i]>=b[i] && x>0) || (y==0 && x>0)){
                profit +=a[i];
                x--;
            }else{
                profit+=b[i];
                y--;
            }
        }
        return profit;
        
    }
}