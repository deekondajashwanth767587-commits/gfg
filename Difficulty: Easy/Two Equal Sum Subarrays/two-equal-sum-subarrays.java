class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int totalsum=0;
        int[] prefix = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        if(totalsum%2!=0){
            return false;
        }
        totalsum=totalsum/2;
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
            if(prefix[i]==totalsum || prefix[i-1]==totalsum)return true;
        }
        
        return false;
    }
}