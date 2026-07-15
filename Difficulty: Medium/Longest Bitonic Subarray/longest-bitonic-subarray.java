class Solution {
    public int bitonic(int[] arr) {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            int c1=1;
            int j=i;
            while(j+1<n && arr[j]<=arr[j+1]){
                j++;
                c1++;
            }
            int c2=1;
            while(j+1<n && arr[j]>=arr[j+1]){
                j++;
                c2++;
            }
            max=Math.max(max,c1+c2-1);
        }
        return max;
    }
}