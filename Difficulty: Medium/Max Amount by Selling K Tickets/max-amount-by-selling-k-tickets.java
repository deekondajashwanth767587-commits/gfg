class Solution {
    public int maxAmount(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){
            pq.add(i);
            
        }
        long totalmax=0;
        final int MOD = 1000000007;
        for(int j=k;j>0;j--){
            if(pq.isEmpty())break;
            int max=pq.poll();
            totalmax = (totalmax + max) % MOD;
            if(max>0){
             max--;   
            }
            if(max>0){
                
            
            pq.add(max);
            }
        }
        
        return (int)totalmax;
    }
}