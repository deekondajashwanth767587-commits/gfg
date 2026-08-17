class Solution {
    public int minThrows(int n, int[] lad, int[] sn) {
        // code here
     int totalcells = n*n;
     int[] jump = new int[totalcells+1];
     Arrays.fill(jump , 0);
     for(int i=0;i<lad.length  ; i+=2){
         int start = lad[i];
         int end = lad[i+1];
         jump[start]=end;
     }
     for(int i=0; i<sn.length;i+=2){
         int start =sn[i];
         int end = sn[i+1];
         jump[start]=end;
         
     }
      Queue<Integer> queue = new LinkedList<>();
      boolean[] visited = new boolean[totalcells+1];
      queue.offer(1);
      visited[1]=true;
     int throwcount=0;
     while(!queue.isEmpty()){
         int size = queue.size();
         while(size-->0){
             int current = queue.poll();
             for(int dice =1 ; dice<=6 ; dice++){
                 int next = current+dice;
                 if(next>totalcells){
                     continue;
                 }
                 if(jump[next]!=0){
                     next = jump[next];
                 }
                 if(next==totalcells){
                     return throwcount+1;
                 }
                 if(!visited[next]){
                     visited[next]=true;
                     queue.offer(next);
                 }
             }
         }
         throwcount++;
     }
     return -1;
    }
}