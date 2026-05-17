class Solution {
    static boolean isPrime(int n) {
        // code here\
        if(n<2)return false;
        int  x = (int)Math.sqrt(n); 
        for(int i=2;i<=x;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}