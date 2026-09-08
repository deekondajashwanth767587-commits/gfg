class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int xs=-1;
        int js=-1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length; i++){
             if(arr[i]==x){
                 if(js!=-1){
                     min = Math.min(min, Math.abs(i-js));
                 }
                 xs=i;
             }else if(arr[i]==y){
                 if(xs!=-1){
                     min= Math.min(min , Math.abs(i-xs));
                 }
                 js=i;
             }
        }
        if(min== Integer.MAX_VALUE)return -1;
        
        return min;
    }
}