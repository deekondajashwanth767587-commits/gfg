class Solution {
    public int sumDiffPairs(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int result=0;
        int j=arr.length-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[j]-arr[i]<k){
                result+=(arr[i]+arr[j]);
                i--;
                j-=2;
            }else{
                
            
            j--;
            }
        }
        
        
        return result ;
        
    }
}