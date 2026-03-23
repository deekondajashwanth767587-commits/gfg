class Solution {
    public int longestCycle(int V, int[][] edges) {
        // code here
        int[] next= new int[V];
        Arrays.fill(next , -1);
        for(int[] e : edges)next[e[0]]=e[1];
        boolean[] visited = new boolean[V];
        int max=-1;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                int curr=i;
                Map<Integer, Integer>map = new HashMap<>();
                int step=0;
                while(curr!=-1 && !visited[curr]){
                    visited[curr]=true;
                    map.put(curr, step++);
                    curr = next[curr];
                    
                    if(curr!=-1 && map.containsKey(curr)){
                        int cyclelength= step-map.get(curr);
                        max = Math.max(max , cyclelength);
                        break;
                        
                    }
                }
            }
        }
        return max;
        
    }
}