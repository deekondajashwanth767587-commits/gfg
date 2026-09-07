
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        // code here
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        if(max==0)return 0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<min){
                min=arr2[i];
            }
        }
        Long result = (long)max*min;
        return result;
    }
}