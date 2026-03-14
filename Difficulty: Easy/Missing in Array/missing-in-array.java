class Solution {
    int missingNum(int arr[]) {
        // code here
        long n =arr.length+1;
        long expected=n*(n+1)/2;
        long  sum =0;
        for(int i:arr){
            sum+=i;
        }
        return (int)(expected-sum);
    }
}