class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
        int n = arr.length;
        int flips=0;
        int currentflips=0;
        int[] fliped = new int[n];
        for(int i=0;i<n ;i++){
            if(i>=k){
                currentflips-=fliped[i-k];
            }
            if((arr[i]+currentflips)%2==0){
                if(i+k>n)return -1;
                flips++;
                currentflips++;
                fliped[i]=1;
            }
        }
        return flips;
    }
}
