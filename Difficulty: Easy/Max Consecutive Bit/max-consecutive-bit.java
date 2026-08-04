class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int max =0;
        int current1 =0;
        int current0=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                current1++;
                current0=0;
            }else{
                current1=0;
                current0++;
            }
            int currentmax = Math.max(current0 , current1);
            max= Math.max(currentmax , max);
            
        }
        return max;
    }
}
