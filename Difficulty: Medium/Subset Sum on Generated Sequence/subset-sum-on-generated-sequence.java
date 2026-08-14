class Solution {
    public boolean isPossible(int[] arr, int s, int x) {
        // code here
        ArrayList<Long > seq= new ArrayList<>();
        seq.add((long)s);
        long prefix= s;
        for(int i=0;i<arr.length;i++ ){
            long curr = prefix +arr[i];
            seq.add(curr);
            prefix+=curr;
            
        }
        int target = x;
        for(int i= seq.size()-1 ; i>=0;i--){
            if(seq.get(i)<=target){
                target-=seq.get(i);
            }
        }
        return target==0;
        
    }
}