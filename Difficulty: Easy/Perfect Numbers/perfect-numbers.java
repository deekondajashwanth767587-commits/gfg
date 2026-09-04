class Solution {
    static boolean isPerfect(int n) {
        // code here
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                if(i*i!=n){
                    sum+=n/i+i;
                }else{
                    sum+=i;
                }
            }
        }
        return sum==n;
    }
};