class Solution {
    public int findMotherVertex(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[] :edges){
            adj.get(edge[0]).add(edge[1]);
        } 
        boolean[] visited = new boolean[V];
        int candidate = -1;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited);
                candidate = i;
            }
        }
        visited = new boolean[V];
         dfs(candidate, adj, visited);
         for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                return -1;
            }
        }
        int answer = candidate;
        for (int i = 0; i < candidate; i++) {
            visited = new boolean[V];
            dfs(i, adj, visited);
            
            boolean canReachAll = true;
            
            for (int j = 0; j < V; j++) {
                if (!visited[j]) {
                    canReachAll = false;
                    break;
                }
            }
            
            if (canReachAll) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    public void dfs(int node , ArrayList<ArrayList<Integer>> adj , boolean[] visited){
        visited[node]=true;
        for(int i:adj.get(node)){
            if(!visited[i]){
                dfs(i, adj , visited);
            }
        }
    }
}