class Solution {
    public int minimumEdgeReversal(int[][] edges, int n, int src, int dst) {
        // code here
        ArrayList<ArrayList<int[] >> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int[] edge:edges){
            int u  = edge[0];
            int v = edge[1];
            adj.get(u).add(new int[]{v, 0});
            adj.get(v).add(new int[]{u,1});
            
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist , Integer.MAX_VALUE);
        Deque<Integer> dq = new ArrayDeque<>();
        dist[src]=0;
        dq.add(src);
        while(!dq.isEmpty()){
            int current = dq.removeFirst();
            for(int[] next:adj.get(current)){
                int neigh=next[0];
                int cost= next[1];
                int newdist = dist[current]+cost;
                if(newdist<dist[neigh]){
                    dist[neigh]=newdist;
                    if(cost==0){
                        dq.addFirst(neigh);
                    }else{
                        dq.addLast(neigh);
                    }
                }
            }
        }
        if(dist[dst]==Integer.MAX_VALUE ){
            return -1;
        }
        return dist[dst];
    }
}