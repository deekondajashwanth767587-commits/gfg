class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
         int n = arr.length;
        int minid =0;
        int maxid=arr.length-1;
        int m = arr[n-1]+1;
        for(int i=0; i<n ;i++){
            if(i%2==0){
                arr[i]+=(arr[maxid]%m)*m;
                maxid--;
            }else{
                arr[i]+=(arr[minid]%m)*m;
                minid++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]/=m;
        }
        
    }
}
