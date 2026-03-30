

class Solution {

    public int minCost(int[][] houses) {
        // code here
        int n = houses.length;
        boolean[] visited = new boolean[n];
        PriorityQueue<int[] > pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,0});
        int totalcost=0;
        int edgeused=0;
        while(edgeused<n){
            int[] curr = pq.poll();
            int cost = curr[0];
            int node=curr[1];
            if(visited[node])continue;
            visited[node]=true;
            totalcost+=cost;
            edgeused++;
            for(int i=0;i<n;i++){
                
                if(!visited[i]){
                int dist=Math.abs(houses[node][0]-houses[i][0])+Math.abs(houses[node][1]-houses[i][1]);
                pq.offer(new int[]{dist, i});
                }
                
            }
        }
        return totalcost;
    }
}
