class Solution {
    public int sequence(int n) {
        // code here
        long ans=0;
        long current =1;
        for(int  i=1;i<=n;i++){
            long temp =1;
            for(int j=1;j<=i;j++){
                temp = (temp*current)%1000000007;
                current++;
            }
            ans = (ans+temp)%1000000007;
        }
        return (int) ans;
    }
};