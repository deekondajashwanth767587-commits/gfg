class Solution {
    int minToggle(int[] arr) {
        // code here
        int rightzero=0;
        for(int i:arr){
            if(i==0)rightzero++;
        }
        
        int leftone=0;
        int ans = leftone+rightzero;
        for(int num:arr){
            if(num==1)leftone++;
            else rightzero--;
            ans= Math.min(ans , leftone+rightzero);
        }
        return ans;
    }
    
}