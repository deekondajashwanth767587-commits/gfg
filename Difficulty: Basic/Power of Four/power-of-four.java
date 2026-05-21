class Solution {
    boolean isPowerOfFour(int n) {
        // code here
        if(n<0)return false;
        return (n&(n-1))==0 && n%3==1;
    }
}