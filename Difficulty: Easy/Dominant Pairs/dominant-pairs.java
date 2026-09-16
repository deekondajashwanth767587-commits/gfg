class Solution {
    public int dominantPairs(int[] arr) {
        // Code here
        int n  = arr.length;
        int mid = n/2;
        Arrays.sort(arr, mid , n);
        int count =0;
        
        for(int i=0;i<mid ;i++){
            int low =mid ;
            int high = n;
            
            while(low<high){
                int  m = (low+high)/2;
                if((long)arr[i]>=5L*arr[m]){
                    low=m+1;
                }else{
                    high=m;
                }
            }
            count+=low-mid;
        }
        
        
        
        
        
        return count;
        
    }
}