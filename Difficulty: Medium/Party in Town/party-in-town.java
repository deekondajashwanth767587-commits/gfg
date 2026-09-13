class Solution {
    public int partyHouse(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] first = bfs(adj , 0);
        int lastnode = first[0];
        
        int[] second = bfs(adj , lastnode);
        int diameter = second[1];
        return (diameter+1)/2;
    }
    
    public int[] bfs(ArrayList<ArrayList<Integer>> adj, int start){
        int n = adj.size();
        int[] dist = new int[n];
        Arrays.fill(dist , -1);
        Queue<Integer> queue = new LinkedList<>();
        dist[start]=0;
        queue.add(start);
        int far = start;
        int maxdistance =0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int value:adj.get(current)){
                int next = value-1;
                if(dist[next]==-1){
                    dist[next]=dist[current]+1;
                    queue.add(next);
                
                    if(dist[next]>maxdistance){
                        maxdistance= dist[next];
                        far = next;
                    }
                }
                
            }
        }
        return new int[]{far , maxdistance};
    }
}