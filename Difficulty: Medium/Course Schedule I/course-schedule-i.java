class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        // code here
      List<List<Integer>> graph = new ArrayList<>();
      for(int i=0;i<n;i++){
          graph.add(new ArrayList<>());
          
      }
      int[] indegree = new int[n];
      for(int[] pre:prerequisites){
          int x=pre[0];
          int y=pre[1];
          graph.get(y).add(x);
          indegree[x]++;
          
      }
      Queue<Integer> q = new LinkedList<>();
       for(int i=0;i<n;i++){
           if(indegree[i]==0){
               q.offer(i);
           }
       }
       int count=0;
       
       while(!q.isEmpty()){
           int node = q.poll();
           count++;
           for(int i:graph.get(node)){
               indegree[i]--;
               if(indegree[i]==0)q.offer(i);
           }
       }
       return count==n;
        
        
    }
}