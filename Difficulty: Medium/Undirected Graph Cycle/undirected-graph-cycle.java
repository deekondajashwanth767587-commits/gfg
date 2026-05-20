class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V ;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int[] edge:edges){
            int v= edge[0];
            int w= edge[1];
            adj.get(v).add(w);
            adj.get(w).add(v);
            
        }
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i, -1 , visited , adj)){
                    return true;
                }
            }
        }
        
        
        return false;
    }
    public boolean dfs(int node , int parent , boolean[ ] visited , ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        for(int nigh:adj.get(node)){
            if(!visited[nigh]){
                if(dfs(nigh , node , visited , adj)){
                    return true;
                }
            }
            else if(nigh!=parent){
                return true;
            }
        }
        return false;
    }
}