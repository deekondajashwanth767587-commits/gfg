class Solution {
    public int find(int[] arr) {
        // code here
        int low =1;
        int high =0;
        for(int i:arr){
            high = Math.max(high,i);
            
        }
        int ans = high;
        int max=high;
        while(low<=high){
            int mid=(low+high)/2;
            long current = mid;
            boolean possible = true;
            for(int num:arr){
                current=2*current-num;
                if(current<0){
                    possible=false;
                    break;
                    
                }
                if(current>max){
                    current=max;
                }
            }
            if(possible){
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}
