class Solution {
    public int getCount(int n) {
        // code here
        int count=0;
        for(int k=2;k<n;k++){
            int basesum = (k*(k-1))/2;
            if(basesum>=n){
                break;
            }
            if((n-basesum)%k==0){
                count++;
            }
        }
        
        
        return count;
    }
};