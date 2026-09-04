class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        double result=0;
        
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2==0){
            result+=arr[(n-1)/2];
            result+=arr[(n)/2];
        }else{
            return (double)arr[n/2];
        }
        return result/2;
    }
}
