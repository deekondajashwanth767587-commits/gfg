class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];
        q.offer(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int node = q.poll();
            result.add(node);
            for(int edgenode:adj.get(node)){
                if(!visited[edgenode]){
                    visited[edgenode]=true;
                    q.offer(edgenode);
                }
            }
        }
        return result;
    }
}