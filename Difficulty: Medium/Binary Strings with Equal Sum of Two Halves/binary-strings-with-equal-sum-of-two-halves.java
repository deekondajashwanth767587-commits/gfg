class Solution {
    static final long MOD=1000000007L;
    
    private long power(long a , long b){
        long result=1;
        while(b>0){
            if((b&1)==1){
                result=(result*a)%MOD;
                
            }
            a= (a*a)%MOD;
            b=b>>1;
        }
        return result;
        
    }
    public int computeValue(int n) {
        // code here
        long[] fact = new long[2*n+1];
        fact[0]=1;
        for(int i=1;i<=2*n;i++){
            fact[i]=(fact[i-1]*i)%MOD;
        }
        long numerator = fact[2*n];
        long denominator=(fact[n]*fact[n])%MOD;
        long inversedenominator=power(denominator , MOD-2);
        long answer = (numerator*inversedenominator)%MOD;
        return (int)answer;
    }
}