class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<start || arr[i]>end){
                arr[i]=0;
            }else{
                count++;
            }
        }
        return count==(end-start+1);
    }
}