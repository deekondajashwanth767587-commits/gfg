class Solution {
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> result= new ArrayList<>();
        HashMap<Integer , ArrayList<Integer>>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i] , new ArrayList<>());
            } 
            map.get(arr[i]).add(i);
        }
        for(int[] q:queries){
            int low = q[0];
            int high = q[1];
            int target= q[2];
            if(!map.containsKey(target)){
                result.add(0);
                continue;
            }
            ArrayList<Integer>pos = map.get(target);
            int l = low(pos, low);
            int r = up(pos, high);
            result.add(r-l);
        }
        return result;
    }
     public int low(ArrayList<Integer> pos, int target){
         int low =0;
         int high = pos.size();
         while(low<high){
             int mid=(low+high)/2;
             if(pos.get(mid)>=target){
                 high=mid;
             }else{
                 low=mid+1;
             }
         }
         return low;
     }
     public int up(ArrayList<Integer> pos, int target){
         int low=0;
         int high=pos.size();
         while(low<high){
             int mid = (high+low )/2;
             if(pos.get(mid)>target){
                 high=mid;
             }else{
                 low=mid+1;
                
             }
         }
         return low;
     }
}