class Solution {
    public int convertFive(int n) {
        // code here
        if(n==0 )return 5;
        else return convert(n);
    }
    public int convert(int num){
        int result =0;
        int placeholder=1;
        while(num>0){
            int digit = num%10;
            if(digit==0){
                digit=5;
            }
            result = result+digit*placeholder;
            placeholder*=10;
            num/=10;
        }
        return result;
    }
}