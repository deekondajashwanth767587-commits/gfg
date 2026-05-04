class Solution {
    public boolean isBinaryPalindrome(int n) {
        // code here
        
        int x = (int)(Math.log(n) / Math.log(2)) + 1;
        int l = 0;
        int r = x - 1;
        while(l<r){
            if(((n>>l)&1) != ((n>>r)&1))return false;
            l++;
            r--;
        }
        return true;
    }
};