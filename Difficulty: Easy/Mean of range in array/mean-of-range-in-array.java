class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        int[] prefix = new int[arr.length];
        ArrayList<Integer> result = new ArrayList<>();
        prefix[0]=arr[0];
        for(int i=1;i<arr.length ;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        for(int[] q:queries){
            int sum =0;
            int l=q[0];
            int r=q[1];
            if(l!=0){
             sum = prefix[r]-prefix[l-1];
            }else{
                 sum = prefix[r];
            }
            result.add(sum/(r-l+1));
        }
        return result;
    }
}